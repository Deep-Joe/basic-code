package com.itheima.joe.test01;

public class Test09 {
    /**
     * 判断是否为直角三角形
     * c是斜边
     * c² = a² + b²；
     */
    public static void main(String[] args) {
         boolean flag = isSquare(3,5,4);
         System.out.println("3:4:5" +"是否可以组成直角三角形:" + flag);
        //System.out.println(swap(3, 4));
    }

    public static boolean isSquare(int a, int b, int c) {
        int max = max(a, b, c);
        if (a == max)
            return c * c + b * b == a * a;
        else if (b == max)
            return a * a + c * c == b * b;
        else
            return a * a + b * b == c * c;

    }

    public static int max(int a, int b, int c) {
        int max;
        int temp;
        temp = a > b ? a : b;
        max = temp > c ? temp : c;
        return max;
    }
   /* public static int swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        return b;
    }*/
}
