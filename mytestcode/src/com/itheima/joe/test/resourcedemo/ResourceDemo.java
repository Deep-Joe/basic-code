package com.itheima.joe.test.resourcedemo;

/*
等待/唤醒机制。

涉及的方法：

1，wait(): 让线程处于冻结状态，被wait的线程会被存储到线程池中。
2，notify():唤醒线程池中一个线程(任意).
3，notifyAll():唤醒线程池中的所有线程。

这些方法都必须定义在同步中。
因为这些方法是用于操作线程状态的方法。
必须要明确到底操作的是哪个锁上的线程。


为什么操作线程的方法wait notify notifyAll定义在了Object类中？

因为这些方法是监视器的方法。监视器其实就是锁。
锁可以是任意的对象，任意的对象调用的方式一定定义在Object类中。
 */
public class ResourceDemo {
    public static void main(String[] args) {
        Resource r = new Resource();
        Input in = new Input(r);
        Output out = new Output(r);

        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);

        t1.start();
        t2.start();
    }
}


class Resource {
    String name;
    String sex;
    boolean flag = false; //用來设置线程的等待/唤醒机制
}

class Input implements Runnable {
    Resource r;

    Input(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        int x = 0;
        while (true) {
            synchronized (r) {
                if (r.flag) {
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (x == 0) {
                    r.name = "mike";
                    r.sex = "nan";
                } else {
                    r.name = "丽丽";
                    r.sex = "女女女";
                }
                x = (x + 1) % 2;
                r.flag = true;
                r.notify();//IllegalMonitorStateException
//               Tread.cuurentThread().notify() 抛出的异常表明某一线程已经试图等待对象的监视器，或者试图通知其他正在等待对象的监视器而本身没有指定监视器的线程。
            }
        }
    }
}

class Output implements Runnable {

    Resource r;

    Output(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true)
            synchronized (r) {
                if (!r.flag) {
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(r.name + r.sex);
                r.flag = false;
                r.notify();
            }
    }
}