package com.itheima.joe.demo.demo01;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        //使用Lambda表达式创建一个线程并开启
        new Thread(() -> System.out.println("线程开启")).start();

        //使用匿名内部实现Runnable接口
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("使用Runnable匿名内部类");
            }
        };

        new Thread(runnable).start();
        //使用匿名内部类创建Thread子对象,并运行
        new Thread() {
            public void run() {
                System.out.println("匿名内部类");
            }
        }.start();
    }
}
