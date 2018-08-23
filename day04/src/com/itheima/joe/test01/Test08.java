package com.itheima.joe.test01;

public class Test08 {
    /**
     * 摄氏度与华氏度的转换
     * 华氏度 =  (9.0)/5 * 摄氏度 + 32;
     */
    public static void main(String[] args) {
        trans(0, 30);
        trans(1, 86);
    }

    public static void trans(int i, double b) {
        System.out.println("i为0时: 摄氏度转化华氏度");
        System.out.println("i为1时: 华氏度转化摄氏度");
        if (i == 0) {
            System.out.println("摄氏度为：" + b + "--华氏度为：" + (9.0 / 5 * b + 32) + '°');
        } else {
            System.out.println("华氏度为：" + b + "--摄氏度为：" + (5.0 / 9 * (b - 32)) + '°');
        }
    }
}
