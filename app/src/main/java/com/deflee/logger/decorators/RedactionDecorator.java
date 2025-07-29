package com.deflee.logger.decorators;

import com.deflee.logger.core.Logger;

public class RedactionDecorator implements Logger {
    private final Logger wrapped;

    public RedactionDecorator(Logger wrapped) {
        this.wrapped = wrapped;
    }

    private String redact(String message) {
        return message
            .replaceAll("(?i)password", "******")
            .replaceAll("(?i)credit card", "******** ****")
            .replaceAll("\\b\\d{4}-\\d{4}-\\d{4}-\\d{4}\\b", "****-****-****-****"); // Mask CC numbers
    }

    @Override
    public void info(String message) {
        wrapped.info(redact(message));
    }

    @Override
    public void warn(String message) {
        wrapped.warn(redact(message));
    }

    @Override
    public void error(String message) {
        wrapped.error(redact(message));
    }
}
