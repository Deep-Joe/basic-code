package com.itheima.joe.test01;

public class Test {
    public static void main(String[] args) {
        /*第二题：分析以下需求并实现
        1.定义方法，求出两个整数的和
        2.调用方法，输出结果

        第三题：分析以下需求并实现
        1.定义方法，求出两个小数的和
        2.调用方法，输出结果

        第四题：分析以下需求并实现
        1.定义方法，求出长方形的周长
        2.调用方法，输出结果

        第五题：分析以下需求并实现
        1.定义方法，求出长方形的面积
        2.调用方法，输出结果*/
        System.out.println(sum(10, 20));
        System.out.println(sum(21.4,23.4));
        System.out.println(circ(4.5,5.5));
        System.out.println(area(3.0,2.0));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double circ(double a, double b) {
        return (a + b) * 2;
    }

    public static double area(double a, double b) {
        return a * b;
    }

}
