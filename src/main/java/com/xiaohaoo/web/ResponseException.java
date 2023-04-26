package com.xiaohaoo.web;

/**
 * Copyright (c) 2022 xiaohao. All Rights Reserved.
 *
 * @author xiaohao
 * @version 1.0
 * @date 2022-05-05 12:53 AM
 */

public class ResponseException extends Exception {
    public ResponseException(String message) {
        super(message);
    }
}