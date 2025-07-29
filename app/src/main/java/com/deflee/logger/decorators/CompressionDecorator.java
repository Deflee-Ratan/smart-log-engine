package com.deflee.logger.decorators;

import com.deflee.logger.core.Logger;

public class CompressionDecorator implements Logger {
    private final Logger wrapped;

    public CompressionDecorator(Logger wrapped) {
        this.wrapped = wrapped;
    }

    private String compress(String message) {
        return message.replaceAll("\\s+", ""); // Simulated compression
    }

    @Override
    public void info(String message) {
        wrapped.info("[COMPRESSED] " + compress(message));
    }

    @Override
    public void warn(String message) {
        wrapped.warn("[COMPRESSED] " + compress(message));
    }

    @Override
    public void error(String message) {
        wrapped.error("[COMPRESSED] " + compress(message));
    }
    @Override
    public void log(String level, String message) {
        wrapped.log(level, compress(message));
    }
}
