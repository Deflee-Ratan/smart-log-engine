package com.deflee.logger.core;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class BaseLogger implements Logger {
    protected String formatMessage(String level, String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        return String.format("[%s] [%s]: %s", timestamp, level.toUpperCase(), message);
    }

    @Override
    public void info(String message) {
        log("INFO", message);
    }

    @Override
    public void warn(String message) {
        log("WARN", message);
    }

    @Override
    public void error(String message) {
        log("ERROR", message);
    }

    public abstract void log(String level, String message);
}
