package com.itheima.joe.test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test02 {
    /**
     *
     第三题：分析以下需求并实现
     1.创建一个ArrayList集合，用于存储一些字符串
     2.通过键盘录入5个字符串，保存到集合中
     3.遍历集合，打印每一个字符串
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + i + "个字符串");
            String s = sc.next();
            arrayList.add(s);
            System.out.println(arrayList.get(i));
        }

    }
}
