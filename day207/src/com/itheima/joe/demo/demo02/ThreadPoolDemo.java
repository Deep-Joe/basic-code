package com.itheima.joe.demo.demo02;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        //创建线程池对象包含2个线程对象。
        ExecutorService service = Executors.newFixedThreadPool(2);
        /*ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(5));*/
        MyRunnable myRunnable = new MyRunnable();
        service.submit(myRunnable);
        service.submit(myRunnable);
        service.submit(myRunnable);
//        ThreadPoolExecutor
    }
}
