package com.eureka.client2.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version 1.0
 * @Author 研发部-陈坤
 * @Date 2018/8/14
 */
@Service
public class Demo2ServiceImpl implements Demo2Service  {

    @Override
    public String hello2( String name) {
        return "远程服务调用失败"+ name;
    }
}
