package com.xiaohaoo.common.web;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * Copyright (c) 2022 xiaohao. All Rights Reserved.
 *
 * @author xiaohao
 * @version 1.0
 * date 2022-04-29 2:20 PM
 */
public class ApplicationTests {
    @Test
    public void test01() {
        System.out.println(HttpStatus.OK);
    }

    @Test
    public void test02() {
        System.out.println(ResponseResult.ok("数据成功", new ArrayList(0)));
    }
}
