package com.xiaohaoo.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * Copyright (c) 2023 xiaohao. All Rights Reserved.
 *
 * @author xiaohao
 * @version 1.0
 * @date 2023-04-26 7:20 PM
 */
public class DylibUtils {
    private final static String OS_NAME = System.getProperty("os.name");

    public static String extractFromInputStream(InputStream inputStream) throws IOException {
        String suffix = "";
        if (OS_NAME.startsWith("Windows")) {
            suffix = ".lib";
        } else if (OS_NAME.startsWith("Linux")) {
            suffix = ".so";
        } else if (OS_NAME.startsWith("Mac")) {
            suffix = ".dylib";
        }
        Path tempFile = Files.createTempFile("", suffix);
        Files.copy(inputStream, tempFile, StandardCopyOption.REPLACE_EXISTING);
        tempFile.toFile().deleteOnExit();
        return tempFile.toFile().getAbsolutePath();
    }
}
