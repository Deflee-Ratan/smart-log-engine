package com.deflee.logger.core;

public class ConsoleLogger extends BaseLogger {

    public void log(String level, String message) {
        System.out.println("[Console] " + formatMessage(level,message));
    }

    @Override
    public void info(String message) {
        LogMessage log = new LogMessage("INFO", message);
        System.out.println(log.getFormattedMessage());
    }

    @Override
    public void warn(String message) {
        LogMessage log = new LogMessage("WARN", message);
        System.out.println(log.getFormattedMessage());
    }

    @Override
    public void error(String message) {
        LogMessage log = new LogMessage("ERROR", message);
        System.err.println(log.getFormattedMessage());
    }
}
