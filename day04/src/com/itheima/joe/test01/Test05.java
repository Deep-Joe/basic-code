package com.itheima.joe.test01;

public class Test05 {
    /**
     * 定义getValue方法，获取三个数中的最值，能够通过字符串，指定获取最大值或者最小值。
     * getValue中，带有String类型参数，可以指定『大』或者『小』
     * 分别定义最大值方法，最小值方法，以供getValue调用。
     *
     */
    public static void main(String[] args) {
        int max = getValue("大", 1, 2,4);
        int min = getValue("小", 1,2,4);
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
    }

    /**
     * 需求分析：返回值？int
     *      传入的参数类型：三个int类型，一个String类型
     */
    public static int getValue(String s, int a, int b, int c) {
        int temp;
        if (s == "小") {
             temp = a < b ? a : b;
            int min = temp < c ? temp : c;
            return min;
        } else {
            temp = a > b ? a : b;
            int max = temp > c ? temp : c;
            return max;
        }
    }
}
