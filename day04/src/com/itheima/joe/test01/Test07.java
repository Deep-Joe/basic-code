package com.itheima.joe.test01;

public class Test07 {
    /**
     * 定义round方法，接收一位小数，实现四舍五入运算，并返回结果。
     */
    public static void main(String[] args) {
        int r1 = round(3.14);
        int r2 = round(3.50);
        System.out.println(r1);
        System.out.println(r2);
    }

    public static int round(double b) {
       int num = (int) b;
       double temp;
       temp = b - num;
       if (temp * 10 >= 5)
           return num + 1;
       else
           return num;
    }
}
