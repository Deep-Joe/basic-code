package com.itheima.joe.test.test09;

public class Test09 {
    //    请按要求编写多线程应用程序，模拟多个人通过一个山洞：
//		1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
//2.随机生成10个人，同时准备过此山洞，并且定义一个变量用于记录通过隧道的人数。显示每次通过山洞人的姓名，和通过顺序；
    public static void main(String[] args) {
        Tunnel tunnel = new Tunnel();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(tunnel,"t" + i);
            thread.start();
        }
    }
}

class Tunnel implements Runnable {

    private int crossNum = 0;

    @Override
    public void run() {
        cross();
    }

    private synchronized void cross() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        crossNum++;
        System.out.println(Thread.currentThread().getName() + "已经通过该隧道" + "他是第" + crossNum + "个通过");
    }
}
