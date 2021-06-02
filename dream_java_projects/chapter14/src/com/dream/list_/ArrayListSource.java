package com.dream.list_;

import java.util.ArrayList;

/**
 * @ClassName : ArrayListSource
 * @Author : huzejun
 * @Date: 2021/5/14-19:18
 */
@SuppressWarnings({"all"})
public class ArrayListSource {
    public static void main(String[] args) {

        //源码解读

        //使用无参构造器创建ArrayList对象
        ArrayList list = new ArrayList(8);
        //使用for循环给list集合，添加1-10数据
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        //使用for循环给list集合，添加11-15数据
        for (int i = 11; i <= 15 ; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);

    }
}
