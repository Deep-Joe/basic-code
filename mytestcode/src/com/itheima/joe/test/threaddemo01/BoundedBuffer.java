package com.itheima.joe.test.threaddemo01;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer {
    final Lock lock = new ReentrantLock();
    final Condition notFull = lock.newCondition();
    final Condition notEmpty = lock.newCondition();
    final Object[] items = new Object[100];
    boolean flag = true;
    int putptr, takeptr, count;

    public void put(Object x) {
        lock.lock();
        try {
            while (count == items.length) {
                notFull.await();
                Thread.sleep(1000);
            }
            items[putptr] = x;
            if (++putptr == items.length) {
                putptr = 0;
            }
            count++;
            flag = false;
            System.out.println("生产了" + (String)x + count);
            notEmpty.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void take() {
        lock.lock();
        try {
            while (count == 0 || flag) {
                notEmpty.await();
                Thread.sleep(1000);
            }
            Object x = items[takeptr];
            System.out.println("消费了...." + (String)x + count);
            if (++takeptr == items.length) {
                takeptr = 0;
            }
            --count;
            notFull.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
