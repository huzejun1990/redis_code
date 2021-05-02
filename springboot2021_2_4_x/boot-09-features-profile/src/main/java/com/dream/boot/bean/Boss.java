package com.dream.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @ClassName : Boss
 * @Author : huzejun
 * @Date: 2021/4/30-23:00
 * @Description :
 */

@Profile(value = {"prod","default"})
@Component
@ConfigurationProperties("person")
@Data
public class Boss implements Person {

    private String name;
    private Integer age;


}
