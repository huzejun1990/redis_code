package com.dream.boot.bean;

/**
 * @Author: huzejun
 * @Date: 2021/3/20 19:03
 */

import lombok.*;

/**
 * 用户
 */
@ToString
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class User {

    private String name;
    private Integer age;

    private Pet pet;

    public User(String name,Integer age){
        this.name = name;
        this.age = age;
    }

}
