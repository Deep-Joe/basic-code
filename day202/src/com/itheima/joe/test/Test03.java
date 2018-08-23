package com.itheima.joe.test;

import java.util.ArrayList;

//三、定义一个集合，存储一些元素。并使用增强for循环遍历输出
public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        list.add("abc5");
        list.add("abc6");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
