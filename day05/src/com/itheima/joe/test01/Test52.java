package com.itheima.joe.test01;

public class Test52 {
    public static void main(String[] args) {
        double[] arr = {88.5, 96, 97, 74, 88.2, 58.5, 77.9, 90, 99};
        double min = getMin(arr);
        double ave = getAverage(arr, min);
        System.out.println(ave);
    }

    /**
     * 2.定义一个分数数组：double[] arr = {88.5,96,97,74,88.2,58.5,77.9,90,99};
     * 计算分数数组中去掉最低分的平均分，并打印
     */
    public static double getMin(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double getAverage(double[] arr, double min) {
        double ave = 1.0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                sum += arr[i];
            }
        }
        ave = sum / (arr.length - 1);
        return ave;
    }
}
