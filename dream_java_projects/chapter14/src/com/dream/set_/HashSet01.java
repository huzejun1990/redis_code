package com.dream.set_;

import java.util.HashSet;

/**
 * @ClassName : HashSet01
 * @Author : huzejun
 * @Date: 2021/5/20-22:45
 */
@SuppressWarnings({"all"})
public class HashSet01 {

    public static void main(String[] args) {
        HashSet set = new HashSet();

        //说明
        //1.在执行add方法后，会返回一个boolean
        //2.如果添加成功，返回 true，否则返回false
        System.out.println(set.add("john"));    //True
        System.out.println(set.add("lucy"));    //true
        System.out.println(set.add("john"));    //false
        System.out.println(set.add("jack"));    //true
        System.out.println(set.add("Rose"));    //true

        set.remove("john");
        System.out.println("set= " + set);  // 3个

        //
        set = new HashSet();
        System.out.println("set="+set); // 0
        //4. HashSet 不能添加相同的元素/数据
        set.add("lucy");    //添加成功
        set.add("lucy");    //添加失败
        set.add(new Dog("tom"));    //成功
        set.add(new Dog("tom"));    //成功
        System.out.println("set=" + set);

        //再加深一下，非常经典的面试题
        //看源码，做分析
        //去查看源码，即 add到底发生了什么？=》 底层机制
        set.add(new String("dream"));   //ok
        set.add(new String("dream"));   //加入不了，no
        System.out.println("set=" + set);
    }
}

class Dog {     //定义了Dog类
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}