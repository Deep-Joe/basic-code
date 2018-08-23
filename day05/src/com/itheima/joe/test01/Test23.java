package com.itheima.joe.test01;

public class Test23 {
    /**
     * 现在有如下一个数组：
     int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
     要求将以上数组中的0项去掉，将不为0的值存入一个新的数组，
     */
    public static void main(String[] args) {
        int oldArr[] = {1, 3, 4, 5, 0, 0, 6, 6, 0,5, 4, 7, 6, 7, 0, 5};
        printArr(oldArr);
        System.out.println("========================");
        printArr(getArr(oldArr));
    }

    public static int[] getArr(int[] arr) {
        int [] newArr;
        int count = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
             if (arr[i] != 0) {
                count++;
            }
        }
        newArr = new int[count];//也可以先计算0的个数来确定数组的长度
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[j] =arr[i];
                j++;
            }
        }
        return newArr;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
