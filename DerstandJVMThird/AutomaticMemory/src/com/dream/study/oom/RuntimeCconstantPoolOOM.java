package com.dream.study.oom;

/**
 * @Author: huzejun
 * @Date: 2020/12/14 21:07
 */
public class RuntimeCconstantPoolOOM {

    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern()== str1);

        //java在 StringBuilder.toString()之前已经出现过所以为 false
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }

}
