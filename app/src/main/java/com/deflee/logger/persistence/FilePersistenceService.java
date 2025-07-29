package com.deflee.logger.persistence;

import com.deflee.logger.core.LogMessage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePersistenceService {

    private final String filePath;

    public FilePersistenceService(String filePath) {
        this.filePath = filePath;
    }

    public void persist(LogMessage message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(message.toString());
            writer.newLine();
        } catch (IOException e) {
            System.err.println("❌ Failed to write log to file: " + e.getMessage());
        }
    }
}
