package com.deflee.logger.core;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogMessage {
    private String timestamp;
    private String level;
    private String message;

    public LogMessage(String level, String message) {
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.level = level;
        this.message = message;
    }

    public String getFormattedMessage() {
        return "[" + timestamp + "] [" + level + "] " + message;
    }

    public String getLevel(){
        return this.level;
    }

     public String getMessage(){
        return this.message;
    }
}
