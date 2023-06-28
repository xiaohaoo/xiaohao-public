package com.xiaohaoo.toolkit.web;

/**
 * Copyright (c) 2022 xiaohao. All Rights Reserved.
 *
 * @author xiaohao
 * @version 1.0
 * @date 2022-04-29 2:20 PM
 */
public class ResponseResult<T> {
    public static <T> ResponseResult<T> unauthorized() {
        return new ResponseResult<>(ResponseStatus.UNAUTHORIZED.statusCode(), ResponseStatus.UNAUTHORIZED.reasonPhrase());
    }

    public static <T> ResponseResult<T> unauthorized(String message) {
        return new ResponseResult<>(ResponseStatus.UNAUTHORIZED.statusCode(), message);
    }

    public int getCode() {
        return code;
    }

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
        return new ResponseResult<>(ResponseStatus.OK.statusCode(), ResponseStatus.OK.reasonPhrase(), data);
    }

    public static <T> ResponseResult<T> ok(String message) {
        return new ResponseResult<>(ResponseStatus.OK.statusCode(), message);
    }

    public static <T> ResponseResult<T> ok() {
        return new ResponseResult<>(ResponseStatus.OK.statusCode(), ResponseStatus.OK.reasonPhrase());
    }

    public static <T> ResponseResult<T> ok(String message, T data) {
        return new ResponseResult<>(ResponseStatus.OK.statusCode(), message, data);
    }

    public static <T> ResponseResult<T> error(String message) {
        return new ResponseResult<>(ResponseStatus.INTERNAL_SERVER_ERROR.statusCode(), message);
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public static <T> ResponseResult<T> error(T data) {
        return new ResponseResult<>(ResponseStatus.INTERNAL_SERVER_ERROR.statusCode(), ResponseStatus.INTERNAL_SERVER_ERROR.reasonPhrase(), data);
    }

    public static <T> ResponseResult<T> error(String message, T data) {
        return new ResponseResult<>(ResponseStatus.INTERNAL_SERVER_ERROR.statusCode(), message);
    }

    public static <T> ResponseResult<T> error() {
        return new ResponseResult<>(ResponseStatus.INTERNAL_SERVER_ERROR.statusCode(), ResponseStatus.INTERNAL_SERVER_ERROR.reasonPhrase());
    }

    @Override
    public String toString() {
        return "ResponseResult{" + "code=" + code + ", message=" + message + ", data=" + data + '}';
    }
}