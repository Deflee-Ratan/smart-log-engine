package com.deflee.logger.persistence;

import com.deflee.logger.core.LogMessage;

public class DatabasePersistenceService {

    // Simulate a connection string or DB config (in a real app, you'd use JDBC or an ORM)
    private final String connectionString;

    public DatabasePersistenceService(String connectionString) {
        this.connectionString = connectionString;
    }

    public void persist(LogMessage message) {
        // Simulated DB persistence (in reality, you'd use JDBC or JPA here)
        System.out.println("📦 [Simulated DB Save] Persisting to DB (" + connectionString + "): " + message.toString());
    }
}
