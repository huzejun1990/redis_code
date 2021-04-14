package com.dream.boot.controller;

import com.dream.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huzejun
 * @Date: 2021/3/19 22:39
 */

@Slf4j
@RestController
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car(){
        return car;
    }

    @RequestMapping("/hello")
    public String handle01(@RequestParam("name") String name){
        System.out.println("=============");
        log.info("请求进来了...");
        return "hello, SpringBoot2 "+" 你好！"+name;
    }
}
