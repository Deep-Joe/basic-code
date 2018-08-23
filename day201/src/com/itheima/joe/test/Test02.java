package com.itheima.joe.test;

import java.util.Calendar;

public class Test02 {
    //三、用程序判断2018年2月14日是星期几。
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.set(2018,02,14);
        int date_of_week = instance.get(Calendar.DAY_OF_WEEK);//星期日序数为1，星期六序数为7
        switch (date_of_week) {
            case 1:
                System.out.println("星期日");
                break;
            case 2:
                System.out.println("星期1");
                break;
            case 3:
                System.out.println("星期2");
                break;
            case 4:
                System.out.println("星期3");
                break;
            case 5:
                System.out.println("星期4");
                break;
            case 6:
                System.out.println("星期5");
                break;
            case 7:
                System.out.println("星期6");
                break;
            default:
                System.out.println("判断错误了");
                break;
        }


    }
}
