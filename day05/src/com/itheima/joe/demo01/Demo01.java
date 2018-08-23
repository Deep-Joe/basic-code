package com.itheima.joe.demo01;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 32, 41, -1, 0};
        int max = getMax(arr);
        System.out.println(max);
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int [] rra = transArray(arr);
        System.out.println(rra);
        for (int i = 0; i < rra.length; i++) {
            System.out.println(rra[i]);
        }
    }

    /**
     * 需求打印数组最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 反转数组
     */
    public static int[] transArray(int[] arr) {
        for(int min = 0,max = arr.length-1; min < max; min++, max--) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        return arr;
    }
}
