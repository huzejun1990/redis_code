package com.dream.boot.controller;

import com.dream.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : HelloController
 * @Author : huzejun
 * @Date: 2021/4/30-22:29
 * @Description :
 */

@RestController
public class HelloController {

    @Value("${person.name:李四}")
    private String name;

    @Value("${MAVEN_HOME}")
    private String msg;

    @Autowired
    private Person person;

    @Value("${os.name}")
    private String osName;

    @GetMapping("/")
    public String hello(){
        return person.getClass().toString();
    }

    @GetMapping("/person")
    public Person person(){
        return person;
    }

    @GetMapping("/msg")
    public String getMsg(){
        return msg +"===>"+osName;
    }

}
