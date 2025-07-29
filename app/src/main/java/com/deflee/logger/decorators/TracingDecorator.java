package com.deflee.logger.decorators;

import com.deflee.logger.core.Logger;
import java.util.UUID;

public class TracingDecorator implements Logger {
    private final Logger wrapped;

    public TracingDecorator(Logger wrapped) {
        this.wrapped = wrapped;
    }

    private String addTraceId(String message) {
        String traceId = UUID.randomUUID().toString().substring(0, 8);
        return "[TRACE-ID:" + traceId + "] " + message;
    }

    @Override
    public void info(String message) {
        wrapped.info(addTraceId(message));
    }

    @Override
    public void warn(String message) {
        wrapped.warn(addTraceId(message));
    }

    @Override
    public void error(String message) {
        wrapped.error(addTraceId(message));
    }

     @Override
    public void log(String level, String message) {
        System.out.println("[Tracing] Entering log(" + level + ")");
        wrapped.log(level, message);
        System.out.println("[Tracing] Exiting log(" + level + ")");
    }
}
