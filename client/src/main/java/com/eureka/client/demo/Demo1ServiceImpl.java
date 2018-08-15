package com.eureka.client.demo;

import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @Author 研发部-陈坤
 * @Date 2018/8/14
 */
@Service
public class Demo1ServiceImpl implements Demo1Service {
    @Override
    public String hello2(String id) {
        return "hello " + id + ", I'm eureka producer service!";

    }
}
