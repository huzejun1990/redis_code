package com.dream.boot.config;

import com.dream.hello.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : MyConfig
 * @Author : huzejun
 * @Date: 2021/5/2-19:41
 */

@Configuration
public class MyConfig {

    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        return helloService;
    }
}
