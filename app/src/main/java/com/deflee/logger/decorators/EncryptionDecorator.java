package com.deflee.logger.decorators;

import com.deflee.logger.core.Logger;
import com.deflee.logger.utils.EncryptionUtil;

public class EncryptionDecorator implements Logger {
    private final Logger wrapped;

    public EncryptionDecorator(Logger wrapped) {
        this.wrapped = wrapped;
    }

    private String encrypt(String message) {
        return  EncryptionUtil.encrypt(message); // Simulated encryption
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

    @Override
    public void log(String level, String message) {
        wrapped.log(level, encrypt(message));
    }
}
