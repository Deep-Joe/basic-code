package com.itheima.joe.test.test01;

public class Test01 {
    public static void main(String[] args) {
        Thread01 t1 = new Thread01("a");
        Thread02 t2 = new Thread02("b");
        t1.start();
        t2.start();
    }

}
class Thread01 extends Thread {
    public Thread01(String name) {
        super(name);
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + sum);
    }
}
class Thread02 extends Thread {
    public Thread02(String name) {
        super(name);
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 200; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + sum);
    }
}
