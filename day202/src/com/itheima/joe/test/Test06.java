package com.itheima.joe.test;

import java.util.ArrayList;

//六、定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。
public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.remove("a");
        System.out.println(list);
        boolean b = listTest(list);
        System.out.println(b);
//        list.iterator()
        System.out.println();
    }

    private static boolean listTest(ArrayList<String> list) {
        return list.isEmpty();
    }

}
