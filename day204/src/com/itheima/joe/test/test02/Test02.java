package com.itheima.joe.test.test02;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 第二题：分析以下需求，并用代码实现
    键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        String s = scanner.next();
        char[] chars = s.toCharArray();
        HashSet<Character> characters = new HashSet<>();
        for (char c : chars) {
            characters.add(c);
        }
        System.out.println(characters);
    }
}
