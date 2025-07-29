package com.deflee.logger.utils;

import java.util.Base64;

public class EncryptionUtil {

    // Simple base64 "encryption" for demo purposes
    public static String encrypt(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    public static String decrypt(String encryptedData) {
        return new String(Base64.getDecoder().decode(encryptedData));
    }
}
