package com.dream.collection;

import java.util.ArrayList;

/**
 * @ClassName : ArrayListDetail
 * @Author : huzejun
 * @Date: 2021/5/14-18:40
 */
@SuppressWarnings({"all"})
public class ArrayListDetail {

    public static void main(String[] args) {

        //ArrayList 是线程还安全的,可以看源码 没有synchronized
        /**
              public boolean add(E e) {
                  ensureCapacityInternal(size + 1);  // Increments modCount!!
                  elementData[size++] = e;
                  return true;
              }
         */

        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jack");
        arrayList.add(null);
        arrayList.add("dream");
        System.out.println(arrayList);

    }
}
