package com.dream.study.gc;

/**
 * @Author: huzejun
 * @Date: 2020/12/19 22:02
 * 此代码演示了两点：
 * 1.对象可以在被GC进自我拯救
 * 2.这种自救的机会只有一次，因为一个对象的finalize()方法最多只会被系统自动调用一次
 */

public class FinallizeEscapeGC {

    public static FinallizeEscapeGC SAVE_HOOK = null;

    public void isAlive(){
        System.out.println("yes, i am still alive :");
        System.out.println("是的，我还活着 :");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        System.out.println("finalize方法执行!");
        FinallizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new FinallizeEscapeGC();

        //对象第一次成功拯救自己
        SAVE_HOOK = null;
        System.gc();
        //因为Finalizer方法优先级很低，暂停0.5秒，以等待它
        Thread.sleep(500);
        if (SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("no, i am dead : (");
            System.out.println("不，我死了：（");
        }

        //下面这段代码与上面的完全不同，但是这次自救却失败了
        SAVE_HOOK = null;
        System.gc();
        //因为Finalizer方法优先级很低，暂停0.5秒，以等待它
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("no, i am dead: (");
        }
    }
}
