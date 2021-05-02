package com.dream.hello.auto;

import com.dream.hello.bean.HelloProperties;
import com.dream.hello.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : HelloServiceAutoConfigure
 * @Author : huzejun
 * @Date: 2021/5/2-18:52
 */

//@Configuration
//@ConditionalOnMissingBean(HelloService.class)
@Configuration
@EnableConfigurationProperties(HelloProperties.class)   //默认 HelloProperties 放在容器中
public class HelloServiceAutoConfiguration {

    @ConditionalOnMissingBean(HelloService.class)
    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        return helloService;
    }

}
