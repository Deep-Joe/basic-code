package com.itheima.joe.test;

public class StringTest01 {
    public static void main(String[] args) {
//        定义一个方法，把数组{1,2,3}按照指定个格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。
        //定义一个int类型的数组
        int[] arr = {1, 2, 3};
        //调用方法
        String s = arrayToString(arr);
        //输出结果
        System.out.println("s:" + s);
    }

    private static String arrayToString(int[] arr) {
        //创建字符串
        String s = new String("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s = s.concat("world" + arr[i] + "]");
            } else {
                s = s.concat("world" + arr[i] + "#");
            }
        }
        return s;
    }
}
