package com.itheima.joe.demo;

public class String_Demo02 {
    public static void main(String[] args) {
        //创建字符串对象
        String s = "helloworld";

        //int length():获取字符串的长度，其实就是字符的个数
        System.out.println(s.length());
        System.out.println("---------");

        //String concat(String str):将指定字符串连接到该字符的末尾。
        String s1 = "helloworld";
        String s2 = s1.concat("**hello itheima");
        System.out.println(s2); //helloworld**hello itheima

        //char charAt(int index):获取指定索引处的字符
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println("-----------");

        //int indexOf(String str): 获取str在字符串对象中第一次出现的索引，没有则返回-1；
        System.out.println(s2.indexOf("l"));
        System.out.println(s2.indexOf("owo"));
        System.out.println(s2.indexOf("ak"));
        System.out.println(s2.indexOf("---------"));

        //Sring substring(int start):从start开始截取字符串到字符串结尾
        System.out.println(s.substring(0));
        System.out.println(s.substring(5));
        System.out.println("----------");

        //String 宿便string（int start,int end）:从start到end截取字符串。[start,end);
        System.out.println(s.substring(0,s.length()));
        System.out.println(s.substring(3,8));
    }
}
