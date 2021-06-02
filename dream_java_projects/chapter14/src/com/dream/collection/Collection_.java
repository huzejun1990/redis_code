package com.dream.collection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName : Collection_
 * @Author : huzejun
 * @Date: 2021/5/8-21:54
 */
public class Collection_ {

    public static void main(String[] args) {
        //内容解读
        //1.集合主要是两组（单列集合，双列集合）
        //2.Collection  接口有两个重要的子接口 List Set 他们的实现子类都是单列集合
       // 3、Map 扩音器的实现子类 是双列集合，存放的 K-V

        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");

        HashMap hashMap = new HashMap();
        hashMap.put("NO1","上海");
        hashMap.put("NO2","杭州");


    }
}
