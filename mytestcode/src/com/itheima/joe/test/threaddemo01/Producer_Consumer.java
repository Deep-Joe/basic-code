package com.itheima.joe.test.threaddemo01;

public class Producer_Consumer {
    public static void main(String[] args) {
        BoundedBuffer bb = new BoundedBuffer();
        Producer producer = new Producer(bb);
        Consumer consumer = new Consumer(bb);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();

    }
}
