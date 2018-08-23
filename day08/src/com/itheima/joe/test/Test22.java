package com.itheima.joe.test;

import java.util.ArrayList;

public class Test22 {
    /*
    二
字符串数组strs中包含字符串{"12","345","6789","1","123","4567"}，创建2个ArrayList集合，
遍历strs数组，并判断数组中每一个元素的长度，将长度为偶数的元素和长度为奇数的元素分别存放在两个集合中，最终将这两个集合在控制台打印输出：
     */
    public static void main(String[] args) {
        String[] strs = {"12", "345", "6789", "1", "4567"};
        ArrayList<String> list01 = new ArrayList<>();
        ArrayList<String> list02 = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() % 2 == 0) {
                list02.add(strs[i]);
            } else {
                list01.add(strs[i]);
            }
        }
        System.out.println(list01);
        System.out.println(list02);
    }
}