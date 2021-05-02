package com.dream.boot.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName : MyCommandLineRunner
 * @Author : huzejun
 * @Date: 2021/5/2-22:20
 */

/**
 * 应用启动做一个一次性事件
 */
@Order(2)
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRunner...run...");
    }
}
