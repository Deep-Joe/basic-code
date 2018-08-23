package com.itheima.joe.test02;

public class Test02 {
    /**
     * 完成下列题目要求：
     ①定义方法filter
     要求如下：
     形参：String [] arr，String  str
     返回值类型：String []
     实现：遍历arr，将数组中包含参数str的元素存入另一个String 数组中并返回
     PS：返回的数组长度需要用代码获取
     ②在main方法中完成以下要求：
     定义一个String数组arr，数组元素有："itcast","itheima","baitdu","weixin","zhifubao"
     调用filter方法传入arr数组和字符串”it”，输出返回的String数组中所有元素
     示例如下：
     */
    public static void main(String[] args) {
        String[] arr = {"itcast", "itheima", "baitdu", "weixin", "zhifubao"};
        String[] newArr = filter(arr, "it");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static String[] filter(String[] arr, String str) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(str)) {
                count++;
            }
        }
        String[] newArr = new String[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("it")) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }
}
