package com.dream.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : ListMethod
 * @Author : huzejun
 * @Date: 2021/5/14-16:01
 */
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("马超");

        //void add(int index, Object ele):在index位置插话ele元素
        //在 index = 1的位置插入一个对象
        list.add(1,"赵云");
        System.out.println("list= "+list);
        //boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1,list2);
        System.out.println("list= " + list);

        //int indexOf(Object obj):返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));
        //int lastIndexOf(Object obj):返回obj在当前集合中最后 出现的位置
        list.add("赵云");
        System.out.println("list= " + list);
        System.out.println(list.lastIndexOf("赵云"));
        // Object remove(int index): 移除指定index位置的元素，并返回此元素
        list.remove(0);
        System.out.println("list= " + list);
        //Object set(int index, Object ele):设置指定index位置的元素为ele,相当于是替换
        list.set(1,"超级玛丽");
        System.out.println("list=" + list);

        //List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合
        List returnlist = list.subList(0, 2);
        System.out.println("returnList=" + returnlist);

    }
}
