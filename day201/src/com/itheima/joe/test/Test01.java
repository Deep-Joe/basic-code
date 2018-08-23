package com.itheima.joe.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) throws ParseException {
        //二、使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse("2018-03-04");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = sdf2.format(date);
        System.out.println(format);

    }
}
