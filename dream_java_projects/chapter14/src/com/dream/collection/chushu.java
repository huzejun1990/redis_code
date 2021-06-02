package com.dream.collection;

/**
 * @ClassName : chushu
 * @Author : huzejun
 * @Date: 2021/5/14-10:45
 */

import java.util.Arrays;

/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半再落下。
 * 求它在第10次落地时，共经过多少米，第10次反弹多高。
 */
public class chushu {
    public static  void main(String[] args) {
        double heiht = 100;
        int h = 2;
        for (int i = 0; i < 10; i++) {

            System.out.println(heiht /= h);
        }
    }
}
