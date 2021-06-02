package com.dream.list_;

/**
 * @ClassName : LinkedList01
 * @Author : huzejun
 * @Date: 2021/5/20-11:26
 */
public class LinkedList01 {

    public static void main(String[] args) {
        //模拟一个简单的双向链表

        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node zhangsan = new Node("张三");

        //连接三个结点，形成双向链表
        // jack -> tom - > zhangsan
        jack.next = tom;
        tom.next = zhangsan;
        //zhangsan -> tom -> jack
        zhangsan.pre = tom;
        tom.pre = jack;

        Node first = jack;  //让first引用指向jack，就是双向链表的头结点
        Node last = zhangsan; //让last引用指向zhangsan,就是双向链表的尾结点

        //演示，从头到尾进行遍历
        System.out.println("========从头到尾========");
        while (true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }

        //演示，从尾到头的遍历
        System.out.println("======从尾到头=====");
        while (true) {
            if (last == null) {
                break;
            }
            //输出last信息
            System.out.println(last);
            last = last.pre;
        }

        //演示链表的添加对象/数据，是多么的方便
        //要求，是在 tom ---------- 直接 插入一个对象 马超

        //1.先创建一个 Node 结点，name就是smith
        Node smith = new Node("smith");
        //下面就把 smith 加入了双向链表
        smith.next = zhangsan;
        smith.pre = tom;
        zhangsan.pre = smith;
        tom.next = smith;

        //让first 再次指向jack
        first = jack;

        System.out.println("========从头到尾===smith=====");
        while (true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }

        last = zhangsan;    //让last重新指向最后一个结点
        //演示，从尾到头的遍历
        System.out.println("========从尾到头的遍历========");
        while (true) {
            if (last == null) {
                break;
            }
            //输出last信息
            System.out.println(last);
            last = last.pre;
        }
    }
}

//定义一个Node类，Node对象 表示双向链表的一个节点

class Node {
    public Object item;     //真正存放数据
    public Node next;       //指向下一个结点
    public Node pre;        //指向上一个结点

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}
