package com.itheima.joe.test.test01;

import java.util.LinkedHashSet;

/**
 * 	1.定义一个长度为10的int数组,并存入10个int类型的数据,其中有一些数据是重复的
    2.利用集合的知识对数组进行去重,产生新数组,不能改变数组中原来数字的大小顺序
    3.打印新数组中的内容
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8, 6};
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            linkedHashSet.add(arr[i]);
        }
        Object[] toArray = linkedHashSet.toArray();
        System.out.print("原数组：[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        System.out.print("新数组：[");
        for (int i = 0; i < toArray.length; i++) {
            if (i == toArray.length-1) {
                System.out.print(toArray[i] + "]");
            } else {
                System.out.print(toArray[i] + ", ");
            }
        }
    }
}
