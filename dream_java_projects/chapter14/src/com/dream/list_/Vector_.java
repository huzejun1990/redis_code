package com.dream.list_;

import java.util.Vector;

/**
 * @ClassName : Vector_
 * @Author : huzejun
 * @Date: 2021/5/14-21:27
 */
@SuppressWarnings({"all"})
public class Vector_ {
    public static void main(String[] args) {

        //无参构造
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println("vector=" + vector);

        //源码解读
        //1. new Vector() 底层
        /*
            public Vector() {
                 this(10);
            }
            补充： 如果是 Vector vector = new Vector(8);
            执行的方法：
                public Vector(int initialCapacity) {
                    this(initialCapacity, 0);
                }

            2. vector.add(i);
            2.1 //下面这个方法就是添加数据到vector集合
             public synchronized boolean add(E e) {
                  modCount++;
                  ensureCapacityHelper(elementCount + 1);
                  elementData[elementCount++] = e;
                  return true;
                }
            2.2 //确实是否需要扩容 条件： minCapacity - elementData
                private void ensureCapacityHelper(int minCapacity) {
               // overflow-conscious code
               if (minCapacity - elementData.length > 0)
                   grow(minCapacity);
                }

           2.3 //如果 需要的数组大小 不够用，就扩容，扩容的算法
           // newCapacity = oldCapacity + ((capacityIncrement > 0) ?
           //               capacityIncrement : oldCapacity);

               private void grow(int minCapacity) {
                  // overflow-conscious code
                  int oldCapacity = elementData.length;
                  int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
                                                   capacityIncrement : oldCapacity);
                  if (newCapacity - minCapacity < 0)
                      newCapacity = minCapacity;
                  if (newCapacity - MAX_ARRAY_SIZE > 0)
                      newCapacity = hugeCapacity(minCapacity);
                  elementData = Arrays.copyOf(elementData, newCapacity);
              }


         */
        //1.
        //1.
    }
}
