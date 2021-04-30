package com.dream.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.dream.admin.mapper")
@ServletComponentScan(basePackages = "com.dream.admin")
@SpringBootApplication(exclude = RedisAutoConfiguration.class) //exclude = RedisAutoConfiguration.class 排除redis服务
public class Boot05WebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot05WebAdminApplication.class, args);
    }

}
