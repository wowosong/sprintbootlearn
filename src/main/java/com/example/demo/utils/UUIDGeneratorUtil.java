package com.example.demo.utils;

import java.util.UUID;

public class UUIDGeneratorUtil {
    private UUIDGeneratorUtil() {
    }

    public static String  generate() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
