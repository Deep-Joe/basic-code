package com.itheima.joe.test.deadlock;

public class DeadLockTest {
    public static void main(String[] args) {
        Test test01 = new Test(true);
        Test test02 = new Test(false);

        Thread t1 = new Thread(test01);
        Thread t2 = new Thread(test02);

        t1.start();
        t2.start();
    }
}

class Test implements Runnable {
    private boolean flag;

    public Test(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            while (true)
                synchronized (MyLock.LOCKA) {//=====================
                    System.out.println(Thread.currentThread().getName() + "if .... LOCKA");
                    synchronized (MyLock.LOCKB) {
                        System.out.println(Thread.currentThread().getName() + "if ...LOCKB");
                    }
                }
        } else {
            while (true)
                synchronized (MyLock.LOCKB) {//========================
                    System.out.println(Thread.currentThread().getName() + "else ...LOCKB");
                    synchronized (MyLock.LOCKA) {
                        System.out.println(Thread.currentThread().getName() + "else ... LOOCKA");
                    }
                }
        }
    }
}

class MyLock {
    public static final Object LOCKA = new Object();
    public static final Object LOCKB = new Object();
}