package com.dream.boot.controller;

import com.dream.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : HelloController
 * @Author : huzejun
 * @Date: 2021/5/2-19:11
 */

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String sayHello(){

        String sayHello = helloService.sayHello("张三");
        return sayHello;
    }
}
