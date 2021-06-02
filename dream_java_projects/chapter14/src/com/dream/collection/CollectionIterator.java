package com.dream.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName : CollectionIterator
 * @Author : huzejun
 * @Date: 2021/5/9-15:02
 */
public class CollectionIterator {
    public static void main(String[] args) {

       Collection col = new ArrayList();

        col.add(new Book("三国演义","罗惯中",10.1));
        col.add(new Book("水浒传","施耐庵",5.1));
        col.add(new Book("西游记","吴承恩",34.6));

//        System.out.println("col=" + col);
        //能够遍历 col集合
        //1.先得到col对应的迭代器
        Iterator iterator = col.iterator();
        //2.使用while循环遍历
/*        while (iterator.hasNext()){ //判断是否还有数据
            //返回下一个元素，类型是object
            Object obj = iterator.next();
            System.out.println("obj= " + obj);
        }*/
        // 快速生成while循环 itit
        //显示所有的快捷键 ctrl + j
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj=" + obj);
        }
        //3.当退出while循环后，这时iterator迭代器，指向最后的元素
//        iterator.next();    //NoSuchElementException
        //4.如何希望再次遍历，需要重置迭代器
        iterator = col.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj2=" + obj);
        }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
