package com.itheima.joe.test01;

public class Test53 {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int count = getCount(6, arr);
        System.out.println("指定的数字是："+6+" 出现的次数是："+count);
        System.out.println("出现次数为1的元素一共有"+getNum(arr));
    }
    /**
     * 3、
     * 1. 定义方法，求出指定元素在数组中出现的次数.
     */
    public static int getCount(int key, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                count++;
            }
        }
        return count;
    }

    /**
     * 	2. 定义方法，统计数组中出现次数为1的元素一共有多少个。(推荐-遍历数组，然后调用第一个方法，求出数组中每个元素在数组中出现的次数，如果只出现了一次，就统计)
     */
    public static int getNum(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
           int count = getCount(arr[i],arr);
           if(count == 1) {
               num++;
           }
        }
        return num;
    }
}
