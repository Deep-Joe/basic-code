package com.itheima.joe.test.threadpool;

public class TestMyThreadPool {
    public static void main(String[] args) {
        MyThreadPool myThreadPool = new MyThreadPool();
        for (int i = 1; i < 20; i++) {
            int num = i;    //匿名内部类中变量必须是不变的
            System.out.println("来了一车砖，需要有线程般");
            myThreadPool.run(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "把第" + num + "车砖搬完。");
                }
            });
        }
    }
}
