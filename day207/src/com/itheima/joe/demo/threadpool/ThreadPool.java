package com.itheima.joe.demo.threadpool;

import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
    public static void main(String[] args) {
//        ThreadPoolExecutor
        MyThreadPool myThreadPool = new MyThreadPool();
        for (int i = 0; i < 500; i++) {
            int num = i;
            myThreadPool.run(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("砖块" + num);
                }
            });
        }
    }
}

class MyThreadPool{
    //设置最大线程数的常量,最大任务数的常量和核心线程常量
    private static final int MAX_THREADS = 5;
    private static final int MAX_TASKS = 5;
    private static final int CORE_THREADS = 3;
    //创建两个队列来存储线程和任务
    private LinkedBlockingQueue<Runnable> runnables = new LinkedBlockingQueue<>(MAX_TASKS);
    private LinkedBlockingQueue<Thread>threads = new LinkedBlockingQueue<>(MAX_THREADS);

    public void run(Runnable runnable) {
        if (threads.size() < CORE_THREADS) {
            Woker woker = new Woker(runnable);
            Thread t = new Thread(woker);
            t.start();
            threads.offer(t);
        } else if (threads.size() >= CORE_THREADS && runnables.size() < MAX_TASKS) {
            runnables.offer(runnable);
        } else if (threads.size() < MAX_THREADS && runnables.size() == MAX_TASKS) {
            Woker woker = new Woker(runnable);
            Thread t = new Thread(woker);
            t.start();
            threads.offer(t);
        }

    }
    private class Woker implements Runnable {
        Runnable runnable;

        public Woker(Runnable runnable) {
            this.runnable = runnable;
        }

        @Override
        public void run() {
            while (true) {
                if (runnable != null) {
                    System.out.println(Thread.currentThread().getName() + " 搬起人生中第一块砖。");
                    runnable.run();
                    runnable = null;
                }
                System.out.println("还有砖可以搬吗？");
                if (runnables.size() > 0) {
                    System.out.println("又搬砖了，，，，，");
                    Runnable r = null;
                    try {
                         r = runnables.take();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    r.run();
                } else {
                    System.out.println("没了，，，，");
                }
            }
        }
    }
}