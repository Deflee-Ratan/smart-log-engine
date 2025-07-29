package com.deflee.logger;

import com.deflee.logger.core.*;
import com.deflee.logger.decorators.*;
import com.deflee.logger.persistence.*;
import com.deflee.logger.utils.*;

import com.deflee.logger.core.ConsoleLogger;
import com.deflee.logger.core.LogMessage;
import com.deflee.logger.decorators.CompressionDecorator;
import com.deflee.logger.decorators.EncryptionDecorator;
import com.deflee.logger.decorators.NotificationDecorator;
import com.deflee.logger.decorators.RedactionDecorator;
import com.deflee.logger.decorators.TracingDecorator;
import com.deflee.logger.persistence.DatabasePersistenceService;
import com.deflee.logger.persistence.FilePersistenceService;

public class LoggerApp {
    public static void main(String[] args) {
        // Step 1: Create a base logger
        Logger baseLogger = new ConsoleLogger();

        // Step 2: Add decorators
        Logger logger = new TracingDecorator(
                            new NotificationDecorator(
                                new RedactionDecorator(
                                    new CompressionDecorator(
                                        new EncryptionDecorator(baseLogger)
                                    )
                                )
                            )
                        );

        // Step 3: Create a log message
        LogMessage message = new LogMessage("User login attempt with email: test@example.com", "INFO");

        // Step 4: Log the message
        logger.log(message.getLevel(),message.getMessage());

        // Step 5: Persist log using file and DB services
        FilePersistenceService fileService = new FilePersistenceService("logs.txt");
        DatabasePersistenceService dbService = new DatabasePersistenceService("DB2Austin");

        // Simulate storing the message
        fileService.persist(message);  // or WARN, ERROR, etc.

        dbService.persist(message);

        System.out.println("✔ Log message saved successfully with all decorators and persisted.");
    }
}
