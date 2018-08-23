package com.itheima.joe.test;

public class ThreadDemo01 {
    public static void main(String[] args) {
        TicketWindowDemo ticketWindowDemo01 = new TicketWindowDemo("售后窗口01");
        TicketWindowDemo ticketWindowDemo2 = new TicketWindowDemo("售后窗口02");
        TicketWindowDemo ticketWindowDemo03 = new TicketWindowDemo("售后窗口03");
        ticketWindowDemo01.start();
        ticketWindowDemo2.start();
        ticketWindowDemo03.start();
    }
}
