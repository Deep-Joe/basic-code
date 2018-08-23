package com.itheima.joe.test;

import java.util.ArrayList;

//五、定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s。
public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("abc");
        a1.add("abcd");
        a1.add("abc");
        String s = "abc";
        boolean b = listTest( a1,  s);
        System.out.println(b);
        a1.remove("abc"); //只会移除掉一个
        System.out.println(a1);
        a1.remove("abc");
        System.out.println(a1);
        System.out.println(listTest(a1,s));
    }

    public static boolean listTest(ArrayList<String> a1, String s) {
        return a1.contains(s);//判断单位是元素
    }
}
