package com.itheima.joe.test.api;

import java.util.Objects;

public class EqualsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
//        System.out.println(Objects.equals(a, b));//基本数据类型不能直接调用方法，并且 基本数据类型比较的是数据值，而不是地址值。

        Person p1 = new Person("张三",18);
        Person p2 = new Person("李四",18);
        Person p3 = new Person("张三",18);
//        System.out.println(p1.equals(p2));
//        System.out.println(p1.equals(p3));

        Object a2 = 1;
        Object b2 = null;
       // System.out.println(Objects.equals(a2,b2));

//        demo01();
//        demo02();
//        demo03();

    }

    private static void demo03() {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }

    private static void demo02() {
        Integer a = 150;
        Integer b = 148;
        Integer c = 148 +2;
        System.out.println(c == a);
    }

    private static void demo01() {
        String s1 = "ab";//地址在常量池
        String s2 = "abc"; //地址在常量池
        String s3 = s1 + "c";//s1是个变量没有真正意义上的物理地址值，地址值在常量池外
        System.out.println(s3 == s2); //false;
        System.out.println(s3.equals(s2));
        System.out.println(s3.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.getClass());
        System.out.println(s2.getClass());
        System.out.println(s2.getClass().getName() + "@" + Integer.toHexString(s2.hashCode()));
        System.out.println(s3.getClass().getName() + "@" + Integer.toHexString(s3.hashCode()));
        System.out.println(String.valueOf(s3));
        System.out.println(String.valueOf(s2));
    }


}
