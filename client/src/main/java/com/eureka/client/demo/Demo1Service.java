package com.eureka.client.demo;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author 研发部-陈坤
 * @Date 2018/8/14
 * @version 1.0
 */
interface Demo1Service {
    String hello2(String id);
}
