package com.itheima.joe.test.test10;

/**
 * 问题：
 创建三个子线程，在每个线程中开启10万次的循环，线程1循环中将循环自增变量i赋值给Integer类型变量 a，
 线程2循环中将字符串"黑马程序员"赋值给String类型变量b,
 线程3循环中将字符串"黑马程序员"和循环自增变量i拼接后赋值给String类型变量c
 分别计算三个线程完成任务所用的毫秒值

 */
public class Test10 {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
        new Thread3().start();

    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        Integer a = null;
        for (int i = 0; i < 100000; i++) {
            a = i;
        }
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + "共用时：" + (end - start));
    }
}
class Thread2 extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        String b = null;
        for (int i = 0; i < 100000; i++) {
            b = "黑马程序员";
        }
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + "共用时：" + (end - start));
    }
}
class Thread3 extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        String c = null;
        for (int i = 0; i < 100000; i++) {
            c = "黑马程序员" + i;
        }
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + "共用时：" + (end - start));
    }
}
