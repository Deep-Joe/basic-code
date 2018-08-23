package com.itheima.joe.test;

import java.util.ArrayList;

//八、定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
public class Test08 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer num = 1;
        list.add(2);
        list.add(3);
        list.add(4);
        int firstIndex = listTest(list,num);
        System.out.println(firstIndex);
    }

    private static int listTest(ArrayList<Integer> list, Integer num) {
        return list.indexOf(num);
    }

}
