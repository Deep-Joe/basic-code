package com.itheima.joe.test.test03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

/**
 * 第三题：分析以下需求，并用代码实现
 * 1.产生10个1-20之间的随机数要求随机数不能重复
 * 2.产生10个长度为10的不能重复的字符串(里面只能出现大写字母、小写字母、0-9的数字)，并遍历打印输出
 */
public class Test03 {
    public static void main(String[] args) {
        method01();
        method02();
    }

    private static void method02() {
        /**
         * 第二个需求步骤分析：
         * 1.获得所要求的字符存入到数组中
         * 2.随机十个不同索引值，然后根据索引值得到相对应的字符存入到LinkedHashSet中
         * 3.将LinkedHashSet()转换成字符数组存在StringBuffer中，再转换成字符串输出。
         */
        char[] chars = new char[62];
        int index = 0;
        Random random = new Random();
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet();
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            chars[i] = (char)('A' + i);
            index++;
        }
        for (int i = 0; i < 26; i++) {
            chars[index] = (char)('a' + i);
            index++;
        }
        for (int i = 0; i < 10; i++) {
            chars[index] = (char)('0' + i);
            index++;
        }
//        System.out.println(chars);
        while (stringLinkedHashSet.size() < 10) {
            while (linkedHashSet.size() < 10) {
                int r_index = random.nextInt(62);
                linkedHashSet.add(chars[r_index]);
            }
//        System.out.println(linkedHashSet);
            for (Character character : linkedHashSet) {
                stringBuilder.append(character);
            }
            String s = stringBuilder.toString();
            stringLinkedHashSet.add(s);
            stringBuilder.delete(0,10);
            linkedHashSet.clear();
        }
        System.out.println(stringLinkedHashSet);
    }

    private static void method01() {
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        while (hashSet.size() < 10) {
            hashSet.add(random.nextInt(20) + 1);
        }
        System.out.println(hashSet);
    }
}
