package com.dream.set_;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @ClassName : LinkedHashSetSource
 * @Author : huzejun
 * @Date: 2021/6/4-12:37
 */
@SuppressWarnings({"all"})
public class LinkedHashSetSource {
    public static void main(String[] args) {
        //分析一下LinkedHashSet的底层机制
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("王",1001));
        set.add(123);
        set.add("dream");

        System.out.println("set=" + set);
        //作者解读
        //1.LinkedHashSet 加入顺序和取出 元素/数据 顺序一致
        //2.LinkedHashSet 底层维护的是一个 LinkedHashMap(是HashMap的子类)
        //3.LinkedHashSet 底层结构（数组+ 双向链表）
        //4.添加第一次时，直接将 数组table 扩容到 16，存放的结点类型是 LinkedHashMap Entry
        //5.数组是 HashMap $Node[] 存放的元素/数据是 LinkedHashMap $Entry类型


        /*
            static class Entry<K,V> extends HashMap.Node<K,V> {
        Entry<K,V> before, after;
        Entry(int hash, K key, V value, Node<K,V> next) {
            super(hash, key, value, next);
        }
    }
         */


    }
}
 class Customer {
    private String name;
    private int no;

     public Customer(String name, int no) {
         this.name = name;
         this.no = no;
     }

     @Override
     public String toString() {
         return "Customer{" +
                 "name='" + name + '\'' +
                 ", no=" + no +
                 '}';
     }
 }