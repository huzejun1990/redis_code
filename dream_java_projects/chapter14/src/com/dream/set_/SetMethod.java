package com.dream.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName : SetMethod
 * @Author : huzejun
 * @Date: 2021/5/20-20:08
 */

@SuppressWarnings({"all"})
public class SetMethod {
    public static void main(String[] args) {

        //解读
        //1、以set接口的实现类 HashSet 来讲解Set接口的方法
        //2 set接口的实现类的对象（Set接口对象），不能存放重复的元素
        //3. set 接口对象存放数据是无序的（添加的顺序和取出的顺序不一致）
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");    //重复
        set.add("jack");
        set.add("dream");
        set.add("mary");
        set.add(null);
        set.add(null); //再次添加null
        for (int i = 0; i < 10; i++) {
            System.out.println("set=" + set );
        }

        //遍历
        //方式1： 使用迭代器
        System.out.println("==========使用迭代器==========");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }

        set.remove(null);

        //方式2：增强for
        System.out.println("=======增强for========");
        for (Object o : set) {
            System.out.println("o= " + o );
        }

        // set 接口对象，不能通过索引来获取


    }
}
