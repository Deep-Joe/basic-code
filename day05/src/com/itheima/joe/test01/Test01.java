package com.itheima.joe.test01;

public class Test01 {
    public static void main(String[] args) {
        int[] score = {80, 90, 85, 90, 78, 88, 89, 93, 98, 75};
        double[] cal = calculate(score);
        System.out.println("不及格人数：" + cal[0]);
        System.out.println("班级平均分：" + cal[1]);
        System.out.println("班级总分数：" + cal[2]);
    }

    /**
     * 分析以下需求并实现
     * 1.定义一个用于存放班级分数的数组
     * int[] score = {80,90,85,90,78,88,89,93,98,75};
     * 2.求出班级不及格人数(分数低于60分的就是不及格)
     * 3.求出班级的平均分
     * 4.求出班级的总分数
     */
    public static double[] calculate(int[] arr) {
        double[] cal = new double[3];
        //计算班级的不及格人数
        int count = 0;
        int sum = 0;
        double ave = 1.0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 60) {
                count++;
            }
            sum += arr[i];
        }
        ave = sum / arr.length;
        cal[0] = count;
        cal[1] = ave;
        cal[2] = sum;
        return cal;
    }
}
