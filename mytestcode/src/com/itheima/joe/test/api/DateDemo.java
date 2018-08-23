package com.itheima.joe.test.api;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前时间到1970年1月1日08：00：00共经历多少毫秒
        Date date = new Date();
        System.out.println(date);

        Date date2 = new Date(0L); //Tue Aug 14 10:46:52 CST 2018
        System.out.println(date2); //Thu Jan 01 08:00:00 CST 1970

        Date date3 = new Date();
        long time = date3.getTime();
        System.out.println(time);// ==System.currentTimeMillis()方法
    }
}
