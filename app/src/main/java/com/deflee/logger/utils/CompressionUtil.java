package com.deflee.logger.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class CompressionUtil {

    public static byte[] compress(String data) throws IOException {
        Deflater deflater = new Deflater();
        deflater.setInput(data.getBytes());
        deflater.finish();

        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            while (!deflater.finished()) {
                int len = deflater.deflate(buffer);
                outputStream.write(buffer, 0, len);
            }
            return outputStream.toByteArray();
        }
    }

    public static String decompress(byte[] compressedData) throws IOException {
        Inflater inflater = new Inflater();
        inflater.setInput(compressedData);

        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            while (!inflater.finished()) {
                int len = inflater.inflate(buffer);
                outputStream.write(buffer, 0, len);
            }
            return outputStream.toString();
        } catch (Exception e) {
            throw new IOException("❌ Failed to decompress data", e);
        }
    }
}
