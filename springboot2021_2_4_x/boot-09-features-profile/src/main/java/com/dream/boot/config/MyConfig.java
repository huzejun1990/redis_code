package com.dream.boot.config;

import com.dream.boot.bean.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @ClassName : MyConfig
 * @Author : huzejun
 * @Date: 2021/4/30-23:06
 * @Description :
 */

@Configuration
public class MyConfig {

    @Profile("prod")
    @Bean
    public Color red(){
        return new Color();

    }

    @Profile("test")
    @Bean
    public Color green(){
        return new Color();

    }
}
