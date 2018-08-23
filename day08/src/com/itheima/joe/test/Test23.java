package com.itheima.joe.test;

import java.util.Random;
import java.util.Scanner;

public class Test23 {
    /*
    三
        模拟注册用户，按照以下要求实现相关功能：
        a. 提示用户在控制台输入手机号码，并接收。
        b. 判断用户输入的是否都是手机号码(11位纯数字), 如果不是手机号码,则提示用户“注册用户失败”。
        c. 将手机号的后四位获取出来输出到控制台上。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的手机号码：");
        String s = sc.next();
        int i = 0;
        while (true) {
            char[] chars = s.toCharArray();
            if ('0' <= chars[i] && chars[i] <= '9') {
                i++;
            } else {
                System.out.println("注册用户失败！");
                s = sc.next();
            }
            if (i == 10) {
                System.out.println("恭喜输入正确！");
                for (int j = chars.length-1; j > chars.length-5; j--) {
                    System.out.println(chars[j]);
                }
                return;
            }
        }
    }
}
