package com.eureka.client2.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version 1.0
 * @Author 研发部-陈坤
 * @Date 2018/8/14
 */

@FeignClient(value = "client1Service",fallback =Demo2ServiceImpl.class )
public interface Demo2Service {
    @GetMapping("/hello")
    String hello2(@RequestParam(value = "name") String name);
}
