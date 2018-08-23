package com.itheima.joe.test01;

public class Test06 {
    /**
     * @param args
     *定义printX方法，打印任意行的图形。
     */
    public static void main(String[] args) {
        printX(6);
    }

    public static void printX(int row) {
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= row; j++) {
                if (i == j || i == (row -j)) {
                    System.out.print(0);
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}
