package com.deflee.logger.decorators;

import com.deflee.logger.core.Logger;

public class NotificationDecorator implements Logger {
    private final Logger wrapped;

    public NotificationDecorator(Logger wrapped) {
        this.wrapped = wrapped;
    }

    private void sendAlert(String message) {
        System.out.println("[ALERT] An error occurred! Notification sent.");
    }

    @Override
    public void info(String message) {
        wrapped.info(message);
    }

    @Override
    public void warn(String message) {
        wrapped.warn(message);
    }

    @Override
    public void error(String message) {
        sendAlert(message);
        wrapped.error(message);
    }
}
