package com.itheima.joe.demo.demo02;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("我要一个教练");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.currentThread().setName("abc");
        System.out.println("教练来了" + Thread.currentThread().getName());
        System.out.println("教我游泳，教完后，教练回到泳池");
    }
}
