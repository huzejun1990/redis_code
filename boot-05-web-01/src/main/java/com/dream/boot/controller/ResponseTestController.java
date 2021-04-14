package com.dream.boot.controller;

import com.dream.boot.bean.Person;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @Author: huzejun
 * @Date: 2021/4/3 22:33
 */
@Controller
public class ResponseTestController {

    @ResponseBody //--RequestResponseBodyMethodProcessor ---> messageConverter
    @GetMapping("/he11")
    public FileSystemResource file(){

        //文件以这样的方式返回看是谁处理的（messageConverter）
        return null;
    }

    // 发请求 http://localhost:8080/test/person?format=json
    // http://localhost:8080/test/person?format=xml

    /**
     * 1、浏览器发请求直接返回xml      [application/xml]       jacksonXmlConverter
     * 2、如果是ajax请求，返回 json   [application/json]      jacksonJsonConverter
     * 3、如果 我的app发请求，返回自定义协议数据  [application/x-dream]  xxxConverter
     *          属性值1：属性值2;
     *
     * 要求：如何以参数的方式进行内容协商
     *
     * 步骤：
     * 1、添加自定义的MessageConverter进系统底层
     * 2、系统底层就会统计出所有MessageConverter 能操作哪些类型
     * 3、客户端内容协商 [dream-->dream]
     * @return
     */
    @ResponseBody
    @GetMapping("/test/person")
    public Person getPerson(){
        Person person = new Person();
        person.setAge(28);
        person.setBirth(new Date());
        person.setUserName("zhangsan");
        return  person;
    }
}
