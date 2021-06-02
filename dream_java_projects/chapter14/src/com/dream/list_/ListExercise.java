package com.dream.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName : ListExercise
 * @Author : huzejun
 * @Date: 2021/5/14-16:36
 */
public class ListExercise {
    public static void main(String[] args) {
        /**
         *添加10个以上的元素，在2号位置插入一个元素"我的公司"，
         * 获得第5个元素，删除第6个元素，修改第7个元素，再使用迭代器遍历集合，
         * 要求：使用List的实现类ArrayList完成
         */

        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello"+i);
        }
        System.out.println("list= " + list);
        //在2号位置插入一个元素"我的公司"
        list.add(1,"我的公司");
        System.out.println("list=" + list);
        //获得第5个元素
        System.out.println("第五个元素" + list.get(4));
        //删除第6个元素
        list.remove(5);
        System.out.println("list=" + list);
        //修改第7个元素
        list.set(6,"三国战绩");
        System.out.println("list= " + list);

        //再使用迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj= " + obj);
        }

    }

}
