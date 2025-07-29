package com.deflee.logger.utils;

public class RedactionUtil {

    // Simple redaction: replace emails and credit card patterns with ***
    public static String redact(String message) {
        String redacted = message;
        redacted = redacted.replaceAll("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", "***@***.com"); // email
        redacted = redacted.replaceAll("\\b(?:\\d[ -]*?){13,16}\\b", "**** **** **** ****"); // credit cards
        return redacted;
    }
}
