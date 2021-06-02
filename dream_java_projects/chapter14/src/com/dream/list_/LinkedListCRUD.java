package com.dream.list_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName : LinkedListCRUD
 * @Author : huzejun
 * @Date: 2021/5/20-17:48
 */
@SuppressWarnings({"all"})
public class LinkedListCRUD {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList=" + linkedList);

        //演示一个删除结点
        linkedList.remove();
//        linkedList.remove(2);

        System.out.println("linkedlist=" + linkedList);

        //修改某个结点对象
        linkedList.set(1,999);
        System.out.println("linkedList=" + linkedList);

        //得到某个结点对象
        //get(1) 是得到双向链表的第二个对象
        Object o = linkedList.get(1);
        System.out.println("o=" + o);

        //因为LinkedList 是 实现了 List接口，遍历方式
        System.out.println("=========LinkedList遍历 迭代器========");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next=" + next);
        }

        System.out.println("=========LinkedList遍历 迭代器 增强for========");
        for (Object o1 : linkedList) {
            System.out.println("o1=" + o1);
        }

        System.out.println("=========LinkedList遍历普通for循环========");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        //源码解读
        /*
            1. LinkedList linkedList = new LinkedList();
                 public LinkedList() {}
            2. 这时 linkeList的属性 first = null last = null

            3.执行
               public boolean add(E e) {
                     linkLast(e);
                     return true;
                 }
             4、将新的结点，加入到双向链表
                 void linkLast(E e) {
                      final Node<E> l = last;
                      final Node<E> newNode = new Node<>(l, e, null);
                      last = newNode;
                      if (l == null)
                          first = newNode;
                      else
                          l.next = newNode;
                      size++;
                      modCount++;
                  }
         */
    }
}
