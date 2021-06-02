package com.dream.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName : CollectionFor
 * @Author : huzejun
 * @Date: 2021/5/14-12:52
 */
public class CollectionFor {

    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗惯中", 10.1));
        col.add(new Book("水浒传", "施耐庵", 5.1));
        col.add(new Book("西游记", "吴承恩", 34.6));

        //1.使用增强for,在Collection集合
        //2.使用增强for,底层仍然是迭代器
        //3.使用增强for可以理解成就是简化版本的 迭代器遍历
/*        for (Object book: col) {
            System.out.println("book= "+ book);
        }*/
        for (Object o : col) {
            System.out.println("book=" + o);
        }


        //增强for,也可以直接在数据组使用
/*        int[] nums = {1,6,11,80};
        for (int i: nums) {
            System.out.println("i="+i);
        }*/
    }
}