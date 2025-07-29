package com.deflee.logger.core;

public interface Logger {
    void info(String message);
    void warn(String message);
    void error(String message);
    void log(String level, String message);
}
