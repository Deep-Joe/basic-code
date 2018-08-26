package com.itheima.joe.test.test07;

public class Test07 {

    //编写程序，创建两个线程对象，一根线程循环输出“播放背景音乐”，另一根线程循环输出“显示画面”，要求线程实现Runnable接口，且使用匿名内部类实现
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                while (true) {
                    System.out.println("播放背景音乐");
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("显示画面");
                }
            }
        };
        Thread t1 = new Thread(r1, "t1");
        Thread t2 = new Thread(r2, "t2");
        t1.start();
        t2.start();
    }


}
