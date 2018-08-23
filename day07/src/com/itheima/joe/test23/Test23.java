package com.itheima.joe.test23;

import java.util.ArrayList;

public class Test23 {
    /*
    第三题
        字符串数组strs中包含字符串{"12","345","6789","1","123","4567"}，创建2个ArrayList集合，
        遍历strs数组，并判断数组中每一个元素的长度，将长度为偶数的元素和长度为奇数的元素分别存放在两个集合中，最终将这两个集合在控制台打印输出：打印格式如下：
     */
    public static void main(String[] args) {
        String[] strs = {"12", "345", "6789", "1", "123", "4567"};
        getOddOrEvenList(strs);
    }

    public static void getOddOrEvenList(String[] strs) {
        ArrayList<String> oddList = new ArrayList<>(); //奇数集合
        ArrayList<String> evenList = new ArrayList<>(); //偶数集合
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() % 2 == 0) {
                evenList.add(strs[i]);
            } else {
                oddList.add(strs[i]);
            }
        }
        System.out.println("strs元素中长度为奇数的是：" + oddList);
        System.out.println("strs元素中长度为偶数的是：" + evenList);
    }
}
