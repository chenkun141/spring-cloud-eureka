package com.eureka.client.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 研发部-陈坤
 * @Date 2018/8/10
 * @version 1.0
 */

@RestController()
public class Demo1Controller {

    @Autowired
    private Demo1Service demo1Service;

    @GetMapping("/hello")
    public String  test(@RequestParam("name") String name) {
        try {
            if(name.contains("c")) {
                System.out.println("被调用了");
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return demo1Service.hello2(name);
    }

}