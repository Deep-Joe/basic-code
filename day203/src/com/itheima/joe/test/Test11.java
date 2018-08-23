package com.itheima.joe.test;


import java.util.LinkedHashSet;
import java.util.Scanner;

//十一、键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序。例如输入：aaaabbbcccddd，打印结果为：abcd。
//LinkedHashSet根据索引顺序打印
//HashSet根据Camparetor()顺序打印
public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        char[] chars = s.toCharArray();
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        for (char aChar : chars) {
            linkedHashSet.add(aChar);
        }
        System.out.println(linkedHashSet);
    }
}
