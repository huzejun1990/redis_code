package com.dream.boot.bean;

/**
 * @Author: huzejun
 * @Date: 2021/3/20 19:03
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * 宠物
 */
@Data
@ToString
@NoArgsConstructor   //无参构造器
@AllArgsConstructor  //全参构造器
public class Pet {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}


