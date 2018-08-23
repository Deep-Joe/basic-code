package com.itheima.joe.test01;

public class Test54 {
    public static void main(String[] args) {
        int[] arr = {171, 72, 19, 16, 118, 51, 210, 7, 18};
        int sum = getSum(arr);
        System.out.println(sum);
    }

    /**
     * 分析以下需求，并用代码实现：
     * (1).定义一个int类型的一维数组，内容为{171,72,19,16,118,51,210,7,18}
     * (2).求出该数组中特定元素的和，特定元素是指个位和十位不包含7的偶数。
     */
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && (arr[i] + 3) % 10 != 0 && (arr[i] / 10 + 3) % 10 != 0) {
                    sum += arr[i];
            }
        }
        return sum;
    }
}
