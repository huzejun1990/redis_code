package com.dream.map_;

import java.util.HashMap;

/**
 * @Author : huzejun
 * @Date: 2021/6/5-17:32
 */
@SuppressWarnings({"all"})
public class HashMapSource1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("java",10);//ok
        map.put("php",10);//ok
        map.put("java",20);//替换value

        System.out.println("map=" + map);

    }
}
