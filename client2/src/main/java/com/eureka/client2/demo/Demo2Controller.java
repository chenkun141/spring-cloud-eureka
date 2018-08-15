package com.eureka.client2.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 研发部-陈坤
 * @Date 2018/8/10
 * @version 1.0
 */

@RestController()
public class Demo2Controller {

    @Autowired
    private Demo2Service demo2Service;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return demo2Service.hello2(name);
    }
}
