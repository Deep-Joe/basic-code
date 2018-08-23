package com.itheima.joe.test01;

import java.util.Scanner;

public class Test51 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个值");
            arr[i] = in.nextInt();
        }
        int num = getNum(arr);
        System.out.println("所求值为:" + num);
    }

    /**
     * 1.获取数组中元素值为偶数的累加和与元素值为奇数的累加和，并计算他们之间的差值
     * 1.定义int getNum(int[] arr)静态方法，该方法要求完成
     * 1.1 获取指定数组arr中元素值为偶数的累加和
     * 1.2 获取指定数组arr中元素值为奇数的累加和
     * 1.3 返回偶数累加和与奇数累加和之间的差值（大于-1的整数）
     * 2.定义main方法：
     * 2.1 获取键盘录入的5个int数，并存放到int数组arr中，输入前提示输入的是第几个值
     * 2.2 传递数组arr调用getNum(int[] arr)方法，获取返回值，并打印输出
     */
    public static int getNum(int[] arr) {
        //偶数和
        int sum1 = 0;
        //奇数和
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum1 += arr[i];
            } else {
                sum2 += arr[i];
            }
        }
        if (sum1 > sum2) {
            return sum1 - sum2;
        } else {
            return sum2 - sum1;
        }
    }
}
