package com.xiaohaoo.toolkit.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Copyright (c) 2022 xiaohao. All Rights Reserved.
 *
 * @author xiaohao
 * @version 1.0
 * @date 2022-05-05 2:17 PM
 */
public class DateTimeUtils {

    public static String getStringOfNowDateTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public static String getStringOfNowDateTime(String pattern) {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern));
    }
}
