package com.dream.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName : HastSet_
 * @Author : huzejun
 * @Date: 2021/5/20-20:34
 */
@SuppressWarnings({"all"})
public class HastSet_ {
    public static void main(String[] args) {
        //源码解读
        //1、构造器走的源码
        /*
           public HashSet() {
               map = new HashMap<>();
           }
         2. HashSet
         */
        Set hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("hashSet" + hashSet);
    }
}
