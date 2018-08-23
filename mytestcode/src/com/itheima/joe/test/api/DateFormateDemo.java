package com.itheima.joe.test.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormateDemo {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日日期：");
        String s = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月DD日");
        try {
            Date birthday = sdf.parse(s);
            long birthTime = birthday.getTime();
            long time = new Date().getTime();
            int day = (int) ((time-birthTime) / (24*60*60*1000));
            System.out.println(day);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

    private static void demo02() {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月DD日 HH时mm分ss秒");
        Date date = null;
        try {
            date = sdf.parse("2018年08月226日 11时28分43秒");
            //System.out.println(date); //try为局部块 在try中创建的变量为局部变量
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date); //try为局部块 在try中创建的变量为局部变量
    }

    private static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月DD日 HH时mm分ss秒");
        Date date = new Date();
        System.out.println(sdf.format(date));//2018年08月226日 11时28分43秒
    }
}
