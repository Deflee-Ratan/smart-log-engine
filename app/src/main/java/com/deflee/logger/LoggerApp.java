package com.deflee.logger;

public class LoggerApp {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();

        logger.info("Application started.");
        logger.warn("Low disk space.");
        logger.error("Unable to connect to database.");
    }
}
