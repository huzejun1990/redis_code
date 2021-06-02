package com.dream.list_;

import java.util.*;

/**
 * @ClassName : ListFor
 * @Author : huzejun
 * @Date: 2021/5/14-16:47
 */
public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        //List 接口实现子类 Vector LinkedList
//        List list = new ArrayList();
//        List list = new Vector();
        List list = new LinkedList();

        list.add("jack");
        list.add("tom");
        list.add("麻辣火锅");
        list.add("北京烤鸭");


        //遍历
        //1.迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        System.out.println("=====增强for====");
        //2.增强for
        for (Object o : list) {
            System.out.println("o=" + o);
        }

        System.out.println("========普通for=======");
        //3.使用普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println("对象=" + list.get(i));
        }

    }
}
