package com.dream.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @Author : huzejun
 * @Date: 2021/6/5-19:47
 */
@SuppressWarnings({"all"})
public class TreeMap_ {
    public static void main(String[] args) {

        //使用默认的构造器，创建TreeMap,是无序的（也没有排序）
        /**
         * 要求：按照传入的 key(String) 的大小进行排序
         * 
         */
//        TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // 按照传入的 key(String) 的大小进行排序
                // 按照字符串长度大小进行排序
//                return ((String) o2).compareTo((String) o1);
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        treeMap.put("jack","杰克");
        treeMap.put("tom","汤姆");
        treeMap.put("zhangsan","张三");
        treeMap.put("smith","史密斯");

        System.out.println("treeMap=" + treeMap);
    }

}
