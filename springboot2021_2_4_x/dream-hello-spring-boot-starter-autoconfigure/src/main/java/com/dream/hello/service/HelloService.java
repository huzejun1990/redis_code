package com.dream.hello.service;

import com.dream.hello.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName : HelloService
 * @Author : huzejun
 * @Date: 2021/5/2-18:28
 */

/**
 * 默认不要放在容器中
 */
public class HelloService {

    @Autowired
    HelloProperties helloProperties;

/*    public String sayHello(String userName){
        return helloProperties.getPrefix() + ": " + userName + "》 " + helloProperties.getSuffix();
    }*/

    public String sayHello(String userName){
        return helloProperties.getPrefix() + "："+userName+"》"+helloProperties.getSuffix();
    }
}
