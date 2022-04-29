package com.xiaohaoo.common.web;

/**
 * @author xiaohao
 * @version 1.0
 * @date 2022-04-29 2:56 PM
 * @Copyright © 2022 xiaohao. All Rights Reserved.
 */
public record ResponseMessage(String message) {

    protected static final ResponseMessage OK = new ResponseMessage("请求成功");
    protected static final ResponseMessage INTERNAL_SERVER_ERROR = new ResponseMessage("服务器内部错误，请联系管理员");
    protected static final ResponseMessage FORBIDDEN_MESSAGE = new ResponseMessage("数据访问暂无权限");
    protected static final ResponseMessage NO_CONTENT_MESSAGE = new ResponseMessage("");

    @Override
    public String toString() {
        return this.message;
    }
}
