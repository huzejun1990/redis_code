package com.dream.study.oom;

/**
 * VM Args: -Xss128k
 * @Author: huzejun
 * @Date: 2020/12/14 20:53
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLead() {
        stackLength++;
        stackLead();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLead();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
