package com.itheima.joe.test01;

public class Test21 {
    /**
     * 一、
     * 需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
     * （静态初始化一个数组，在数组中随意写入6个分数） 选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值。
     * 请写代码实现。(不考虑小数部分)
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5};
        System.out.println(getAverage(arr));
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 100) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
        }
        return min;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 100) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
        }
        return max;
    }

    public static int getAverage(int[] arr) {
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min && arr[i] != max) {
                sum += arr[i];
            }
        }
        return (int) (sum / (arr.length - 2));
    }
}
