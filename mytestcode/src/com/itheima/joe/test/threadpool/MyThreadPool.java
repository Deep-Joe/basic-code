package com.itheima.joe.test.threadpool;

import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class MyThreadPool {
    private static final int coreThreadNum = 3;//核心线程数
    private static final int maxThreadNum = 8;//最大线程数
    private static final int maxTaskNum = 10;

    BlockingQueue<Thread> threads = new LinkedBlockingDeque<>(maxThreadNum);
    BlockingQueue<Runnable> tasks = new LinkedBlockingDeque<>(maxTaskNum);
    int num = 1;

    public void run(Runnable task) {
        //如果没有任务在执行,直接执行这个任务
        if (threads.size() < coreThreadNum) { //当线程池中的线程数目小于核心线程数目时
            Worker worker = new Worker(task);
            Thread t = new Thread(worker);
            t.setName("搬砖工人" + num++);
            t.start();
            threads.offer(t);
            System.out.println("招了一个搬砖工人,并且给它分配了一车砖");
        } else if (threads.size() >= coreThreadNum && tasks.size() < maxTaskNum) {
            //当线程池中的线程数目大于等于核心线程池数目时 并且 任务的数量小于最大任务数量，
            // 则将任务添加到任务队列的缓存中。
            tasks.offer(task);
        } else if (threads.size() < maxThreadNum && tasks.size() == maxTaskNum) {
            //当线程池中的线程数目小于最大线程数量并且任务的数量恒等于最大任务数量时；
            //创建新的线程(但不是核心线程,也就是临时线程)来执行任务队列中的任务。
            Worker worker = new Worker(task);
            Thread t = new Thread(worker);
            t.setName("搬砖工人" + num++);
            t.start();
            threads.offer(t);
        }
    }


    private class Worker implements Runnable {
        Runnable frist_task;

        public Worker(Runnable frist_task) {
            this.frist_task = frist_task;
        }

        @Override
        public void run() {
            while (true) {
                //执行到这里的时候main线程中已经又提交了一次任务
                if (frist_task != null) {
                    System.out.println(Thread.currentThread().getName() + "正式开始搬人生的第一车砖");
                    frist_task.run();

                    frist_task = null;
                }

                System.out.println("老板,还有砖让我去搬吗?");
                if (tasks.size() > 0) {
                    System.out.println("非常开心,发现还可以搬砖");
                    Runnable task = null;
                    try {
                        task = tasks.take();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    task.run();

                } else {
                    System.out.println("发现没有砖可以搬了");
                }

            }
        }
    }


}

