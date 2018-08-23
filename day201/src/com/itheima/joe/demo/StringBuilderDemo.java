package com.itheima.joe.demo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(true);
        stringBuilder.append('a');
        stringBuilder.append(3.14);
        System.out.println(stringBuilder);
        stringBuilder.append("haha");
        System.out.println(stringBuilder);
    }
}
