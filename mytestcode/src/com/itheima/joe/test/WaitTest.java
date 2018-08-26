package com.itheima.joe.test;



public class WaitTest {
    public static void main(String[] args) {
        Resources r = new Resources();
        Test01 test01 = new Test01(r);
        Test02 test02 = new Test02(r);
        new Thread(test02).start();
        new Thread(test01).start();
    }
}

class Test01 implements Runnable {
    //    boolean flag = true;
    private Resources r;

    public Test01(Resources r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (r) {
                if (r.num % 2 == 1) {
                    try {
                        System.out.println("测试下");
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (r.num > 0) {
                    System.out.println(Thread.currentThread().getName() + r.num--);
                    r.notify();
                }
            }
        }
    }
}

class Test02 implements Runnable {
    private Resources r;

    public Test02(Resources r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (r) {
                if (r.num % 2 == 0) {
                    try {
                        System.out.println("测试下2------");
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (r.num > 0) {
                    System.out.println(Thread.currentThread().getName() + r.num--);
                    r.notify();
                }
            }
        }
    }
}

class Resources {
    int num = 100;
}
