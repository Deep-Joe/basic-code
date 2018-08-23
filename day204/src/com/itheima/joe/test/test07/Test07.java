package com.itheima.joe.test.test07;

import java.util.HashMap;

/**
 * 第七题：分析以下需求，并用代码实现
 1.统计每个单词出现的次数
 2.有如下字符串"If you want to change your fate I think you must come to the dark horse to learn java"(用空格间隔)
 3.打印格式：
 to=3
 think=1
 you=2
 //........
 */
public class Test07 {
    public static void main(String[] args) {
        String s = "If you want to change your fate I think you must come to the dark horse to learn java";
        String[] strings = s.split(" ");
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (hashMap.containsKey(strings[i])) {
                hashMap.put(strings[i],hashMap.get(strings[i]) + 1);
            } else {
                hashMap.put(strings[i],1);
            }
        }
        System.out.println(hashMap);
    }
}
