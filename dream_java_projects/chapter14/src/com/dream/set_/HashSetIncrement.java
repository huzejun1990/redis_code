package com.dream.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @ClassName : HashSEtIncrement
 * @Author : huzejun
 * @Date: 2021/6/2-19:51
 */
@SuppressWarnings({"all"})
public class HashSetIncrement {
    public static void main(String[] args) {

        /*
        HashSet底层是HashMap,第一次添加时，table 数组扩容到16，
        临界值（threshold）是 16 * 加载因子（loadFactor）是0.75 = 12
        如果table 数组使用到了临界值 12，就会扩容到 16 * 2 = 32，
        新的临界值就是 32 * 0.75 = 24，依此类推
         */

       HashSet hashSet = new HashSet();
       /*
        for (int i = 1; i <= 100 ; i++) {
            hashSet.add(i); //1,2,3,4,5...100
        }*/

        /*
          在Java8中，如果一条链表的元素个数到达 Treeify_threshold(默认是8)，
          并且table的大小 >= MIN_TREEIFY_CAPACITY(默认64)，就会进行树化（红黑树），
          否则仍然采用数据扩容机制

         */
        for (int i = 1; i <= 12 ; i++) {
            hashSet.add(new A(i));  //equals() 不同
        }
        System.out.println("hashset= " + hashSet);
    }

}

class A {
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return n == a.n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}

