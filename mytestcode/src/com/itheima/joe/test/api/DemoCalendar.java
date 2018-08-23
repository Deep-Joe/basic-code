package com.itheima.joe.test.api;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class DemoCalendar {
    public static void main(String[] args) {
//        demo01();
//        demo02();
//        demo03();
        demo04();
    }

    private static void demo04() {
        Calendar instance = Calendar.getInstance();
        Date time = instance.getTime();
        long time1 = time.getTime();
        System.out.println(time);//Wed Aug 15 00:42:01 CST 2018
        System.out.println(time1);//1534264921368
    }

    private static void demo03() {
        int[] src ={1,2,3,4,5};
        int[] des ={6,7,8,9,10};
        System.arraycopy(src,0,des,0,3);
        System.out.println(Arrays.toString(des));
    }

    private static void demo02() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void demo01() {
        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        System.out.println(year);

        int month = instance.get(Calendar.MONTH);
        System.out.println(month);

        int date = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);

        int date2 = instance.get(Calendar.DATE);
        System.out.println(date2);

    }
}
