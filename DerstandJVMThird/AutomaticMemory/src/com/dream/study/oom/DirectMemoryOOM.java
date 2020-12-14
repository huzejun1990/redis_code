package com.dream.study.oom;

import sun.misc.Unsafe;

import java.lang.reflect.Field;


/**
 * 本机直接内存溢出
 * VM Args: -Xmx20M -XX:MaxDirectMemorySize=10M
 * @Author: huzejun
 * @Date: 2020/12/14 21:14
 */
public class DirectMemoryOOM {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws Exception {
//        Field unsafeField = Unsafe.class.getDeclaredField()[0];
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true){
            unsafe.allocateMemory(_1MB);
        }
    }

}
