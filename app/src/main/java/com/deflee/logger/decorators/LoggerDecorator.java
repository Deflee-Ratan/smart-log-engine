package com.deflee.logger.decorators;

import com.deflee.logger.core.Logger;

public abstract class LoggerDecorator implements Logger {
    protected Logger wrappedLogger;

    public LoggerDecorator(Logger logger) {
        this.wrappedLogger = logger;
    }

    @Override
    public void info(String message) {
        wrappedLogger.info(message);
    }

    @Override
    public void warn(String message) {
        wrappedLogger.warn(message);
    }

    @Override
    public void error(String message) {
        wrappedLogger.error(message);
    }
}
