package com.deflee.logger.decorators;

import com.deflee.logger.core.Logger;

public class EncryptionDecorator implements Logger {
    private final Logger wrapped;

    public EncryptionDecorator(Logger wrapped) {
        this.wrapped = wrapped;
    }

    private String encrypt(String message) {
        return new StringBuilder(message).reverse().toString(); // Simulated encryption
    }

    @Override
    public void info(String message) {
        wrapped.info("[ENCRYPTED] " + encrypt(message));
    }

    @Override
    public void warn(String message) {
        wrapped.warn("[ENCRYPTED] " + encrypt(message));
    }

    @Override
    public void error(String message) {
        wrapped.error("[ENCRYPTED] " + encrypt(message));
    }
}
