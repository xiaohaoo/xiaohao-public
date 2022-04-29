package com.xiaohaoo.common.web;

/**
 * @author xiaohao
 * @version 1.0
 * @date 2022-04-29 2:20 PM
 * @Copyright © 2022 xiaohao. All Rights Reserved.
 */
public class ResponseResult<T> {
    private final HttpStatus status;
    private final ResponseMessage message;
    private final T data;

    private ResponseResult(HttpStatus status, ResponseMessage message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    private ResponseResult(HttpStatus status, ResponseMessage message) {
        this.status = status;
        this.message = message;
        this.data = null;
    }


    public static <T> ResponseResult<T> ok(T data) {
        return new ResponseResult<>(HttpStatus.OK, ResponseMessage.OK, data);
    }

    public static <T> ResponseResult<T> ok(String message) {
        return new ResponseResult<T>(HttpStatus.OK, new ResponseMessage(message));
    }

    public static <T> ResponseResult<T> ok() {
        return new ResponseResult<>(HttpStatus.OK, ResponseMessage.OK);
    }

    public static <T> ResponseResult<T> ok(String message, T data) {
        return new ResponseResult<>(HttpStatus.OK, new ResponseMessage(message), data);
    }

    public static <T> ResponseResult<T> error(String message) {
        return new ResponseResult<T>(HttpStatus.INTERNAL_SERVER_ERROR, new ResponseMessage(message));
    }

    public static <T> ResponseResult<T> error(T data) {
        return new ResponseResult<>(HttpStatus.INTERNAL_SERVER_ERROR, ResponseMessage.INTERNAL_SERVER_ERROR, data);
    }

    public static <T> ResponseResult<T> error(String message, T data) {
        return new ResponseResult<>(HttpStatus.INTERNAL_SERVER_ERROR, new ResponseMessage(message));
    }

    public static <T> ResponseResult<T> error() {
        return new ResponseResult<>(HttpStatus.INTERNAL_SERVER_ERROR, ResponseMessage.INTERNAL_SERVER_ERROR);
    }

}