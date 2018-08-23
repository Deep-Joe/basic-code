package com.itheima.joe.test;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
    /**
     *
     第二题：分析以下需求并实现
     1.通过键盘录入一个数字，作为数组的长度
     2.根据录入的数字，创建一个长度为该数字的数组
     3.通过随机数为数组中的每个元素进行赋值。随机数的范围在1-100之间
     4.求出数组中最大数字
     5.求出数组中的数字平均值
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的长度：");
        int length = sc.nextInt();
        int[] arr = new int[length];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100) + 1;
            System.out.println(num);
            arr[i] = num;
        }
        System.out.println("该数组中的最大值为：" + getMax(arr));
        System.out.println("该数组中的平均值为：" + getAverage(arr));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double getAverage(int[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
