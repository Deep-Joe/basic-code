package com.itheima.joe.demo;

import java.util.Scanner;

public class Demo01StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = sc.next();
        char[] chs = input.toCharArray();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
       /* for (int i = 0; i < chs.length; i++) {
            if ('a' <= chs[i] && chs[i] <= 'z') {
                countLower++;
            } else if ('A' <= chs[i] && chs[i] <= 'Z') {
                countUpper++;
            } else if ('0' <= chs[i] && chs[i] <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }*/
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ('a' <= c && c <= 'z') {
                countLower++;
            } else if ('A' <= c && c <= 'Z') {
                countUpper++;
            } else if ('0' <= c && c <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("小写字母个数是：" + countLower);
        System.out.println("大写字母个数是：" + countUpper);
        System.out.println("数字个数是：" + countNumber);
        System.out.println("其他字符个数是：" + countOther);
    }
}
