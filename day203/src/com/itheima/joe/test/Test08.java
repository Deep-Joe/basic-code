package com.itheima.joe.test;

import java.util.Iterator;
import java.util.LinkedHashSet;

//八、使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。使用迭代器和增强for循环遍历LinkedHashSet。
public class Test08 {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("王昭君");
        strings.add("王昭君");
        strings.add("西施");
        strings.add("杨玉环");
        strings.add("貂蝉");
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("==========");
        Iterator<String> st = strings.iterator();
        while (st.hasNext()) {
            String s = st.next();
            System.out.println(s);
        }
    }
}
