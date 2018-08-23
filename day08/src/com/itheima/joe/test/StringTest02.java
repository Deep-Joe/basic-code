package com.itheima.joe.test;

import java.util.Scanner;

public class StringTest02 {
    public static void main(String[] args) {
//        键盘录入一个字符，统计字符串中大小写字母及数字字符个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串数据：");
        String s = sc.nextLine();

        //定义三个统计变量，初始化值都是0
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        //遍历字符串，得到每一个字符
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //拿字符进行判断
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            } else {
                System.out.println("该字符" + ch + "非法");
            }
        }
        //输出结果
        System.out.println("大写字符：" + bigCount + "个");
        System.out.println("小写字符：" + smallCount + "个");
        System.out.println("数字字符：" + numberCount + "个");
    }
}
