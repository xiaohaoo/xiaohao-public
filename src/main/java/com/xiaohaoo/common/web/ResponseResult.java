package com.xiaohaoo.common.web;

/**
 * Copyright (c) 2022 xiaohao. All Rights Reserved.
 *
 * @author xiaohao
 * @version 1.0
 * @date 2022-04-29 2:20 PM
 */
public class ResponseResult<T> {
    private final int code;
    private final String message;
    private final T data;

    private ResponseResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private ResponseResult(int status, String message) {
        this.code = status;
        this.message = message;
        this.data = null;
    }

    public static <T> ResponseResult<T> ok(T data) {
        return new ResponseResult<>(HttpStatus.OK.value(), ResponseMessage.OK.value(), data);
    }

    public static <T> ResponseResult<T> ok(String message) {
        return new ResponseResult<>(HttpStatus.OK.value(), message);
    }

    public static <T> ResponseResult<T> ok() {
        return new ResponseResult<>(HttpStatus.OK.value(), ResponseMessage.OK.value());
    }

    public static <T> ResponseResult<T> ok(String message, T data) {
        return new ResponseResult<>(HttpStatus.OK.value(), message, data);
    }

    public static <T> ResponseResult<T> error(String message) {
        return new ResponseResult<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
    }

    public static <T> ResponseResult<T> error(T data) {
        return new ResponseResult<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), ResponseMessage.INTERNAL_SERVER_ERROR.value(), data);
    }

    public static <T> ResponseResult<T> error(String message, T data) {
        return new ResponseResult<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
    }

    public static <T> ResponseResult<T> error() {
        return new ResponseResult<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), ResponseMessage.INTERNAL_SERVER_ERROR.value());
    }

    public int getStatus() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "ResponseResult{" + "code=" + code + ", message=" + message + ", data=" + data + '}';
    }
}