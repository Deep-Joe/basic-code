package com.itheima.joe.test.test02;

/**
 * 第二题：使用多线程解决以下问题
 有一个包包的数量为100个。分别从实体店和官网进行售卖！
 要求使用多线程的方式，分别打印实体店和官网卖出包包的信息！
 分别统计官网和实体店各卖出了多少个包包，例如：
 官网共卖出了45个
 实体店共卖出了55个
 */
public class Test02 {
    public static void main(String[] args) {
        RunImpl r = new RunImpl();
        Thread t1 = new Thread(r, "实体店");
        Thread t2 = new Thread(r,"官网");
        t1.start();
        t2.start();
    }
}

class Bag {
    int num = 100;
    int count = 0;
    public synchronized void sell(){
        if (num > 0) {
            System.out.println(Thread.currentThread().getName() + "卖了" + num-- + "号包");
        }
    }
}

class RunImpl implements Runnable {
    Bag bag = new Bag();
    boolean flag = true;
    @Override
    public void run() {
        int count = 0;
        while (flag) {
            bag.sell();
            count++;
            if (bag.num <= 1) {
                flag = false;
            }
        }
        System.out.println(Thread.currentThread().getName() + "一共卖了" + count + "票");
    }
}


