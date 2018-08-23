package com.itheima.joe.demo;

public class MyDemo {
    /*
    int indexOf(int ch)
          返回指定字符在此字符串中第一次出现处的索引。
     */
    public static void main(String[] args) {
        String s = "ababcaadf";
        int index = s.indexOf(98);//b
        System.out.println(index);
        index = s.indexOf(99);//c
        System.out.println(index);
        index = s.indexOf(97);
        System.out.println(index);

        index = s.indexOf("a");
        System.out.println(index);
        index = s.indexOf("a", 0);//[fromIndex,s.length());
        System.out.println(index);

        String s1 = "abc";
        char[] charArray = {'a', 'b', 'c'};
        String s2 = new String(charArray);
        System.out.println(s1.equals(s2));
    }
}
