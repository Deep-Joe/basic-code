package com.itheima.joe.demo.demo02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketDemo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        TicketLock ticketLock = new TicketLock();
        Thread t1 = new Thread(ticketLock);
        Thread t2 = new Thread(ticketLock);
        Thread t3 = new Thread(ticketLock);
        t1.start();
        t2.start();
        t3.start();
    }
}

class Ticket implements Runnable {
    private int ticket = 100;

    /*
    卖票操作
     */
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在热卖" + ticket--);
                }
            }
        }
    }
}

class TicketLock implements Runnable {
    private int ticket = 100;
    Lock lock = new ReentrantLock();

    /*
    卖票操作
     */
    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
                System.out.println(Thread.currentThread().getName() + "正在热卖" + ticket--);
            }

        }
    }
}
