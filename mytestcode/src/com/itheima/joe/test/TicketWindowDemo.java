package com.itheima.joe.test;

public class TicketWindowDemo extends Thread {
    static int tickets = 100;
    static Object object = new Object();
    public TicketWindowDemo(String name) {
        super(name);
    }

    public void run() {
        synchronized (object) {
            while(tickets > 0) {
                System.out.println(this.getName() + "卖出了座位号" + tickets);
                tickets--;
                try{
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
