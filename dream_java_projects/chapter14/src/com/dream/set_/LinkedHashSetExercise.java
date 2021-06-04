package com.dream.set_;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @ClassName : LinkedHashSetExercise
 * @Author : huzejun
 * @Date: 2021/6/4-13:15
 */
public class LinkedHashSetExercise {
    public static void main(String[] args) {

        Set set = new LinkedHashSet();
        set.add(new Car("奥拓",1000));    //ok
        set.add(new Car("奥迪",400000));  //ok
        set.add(new Car("法拉利",100000)); //ok
        set.add(new Car("奥迪",400000));  //no
        set.add(new Car("保时捷",700000)); //ok
        set.add(new Car("奥迪",400000));  //no

        System.out.println("set=" + set);


    }
}

/**
 * Car 类（属性：name,price）,如果 name 和 price 一样，
 * 则认为是相同属性，就不能添加
 */

class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //重写 equals方法 和 hashcode
    //当 name 和 price 相同时，就返回相同的 hashCode值，equals返回t


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0
                && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
