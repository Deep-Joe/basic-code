package com.itheima.joe.test31;

import java.util.Random;

public class Test31 {
    /*
    1.	一定义一个长度为10的int型的数组arr，依次生成10个1-100（范围包括1和100）的随机数并存入arr中,然后将arr中的元素都往前移一个位置，
    最后一个元素的值是原来第一个元素的值，然后输出arr转换前和转换后的所有元素，
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        System.out.println("原来数组：");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
            if (i == arr.length -1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("转换后的数组：");
        int[] newArr = new int[10];
        for (int i = 0; i < newArr.length - 1; i++) {
            newArr[i] = arr[i+1];
        }
        newArr[newArr.length - 1] = arr[0];
        System.out.print("[");
        for (int i = 0; i < newArr.length; i++) {
            if (i == newArr.length-1) {
                System.out.print(newArr[i] + "]");
            } else {
                System.out.print(newArr[i] + ", ");
            }
        }
    }
}
