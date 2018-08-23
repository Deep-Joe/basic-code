package com.itheima.joe.test.test01;

/**
 * 第一题：分析以下需求，并用代码实现
 一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒,
 要求:请用多线程模拟卖票过程并打印剩余电影票的数量
 */
public class Test01 {
    public static void main(String[] args) {
        RunImpl r = new RunImpl();
        Thread t1 = new Thread(r,"t1");
        Thread t2 = new Thread(r,"t2");
        t1.start();
        t2.start();

    }
}

class Ticket {
    int ticket = 100;
    public synchronized void getTicket() {
     if (ticket > 0) {
         System.out.println(Thread.currentThread() + ": 取走" + ticket-- + "号票，剩余：" + ticket + "张");
     }
    }
}

class RunImpl implements Runnable {

    Ticket ticket = new Ticket();
    boolean flag = true;
    @Override
    public void run() {
        while (flag) {
            try {
                Thread.sleep(30);
                ticket.getTicket();
                if (ticket.ticket == 1) {
                    flag = false;
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}