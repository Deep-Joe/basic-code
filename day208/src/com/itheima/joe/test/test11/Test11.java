package com.itheima.joe.test.test11;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//
//第一题：分析以下需求，并用代码实现
//	键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中,每种类型的文件及个数,
//
//	注意:用文件类型(后缀名,不包含.,"java","txt")作为key,用个数作为value,放入到map集合中,并按照如下格式打印map集合中的内容
//
//		docx类型的文件有  1 个
//		java类型的文件有  24 个
//		txt类型的文件有  10 个C:\Users\Joe\Desktop\JAVA
//		//...
public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一文件夹路径：");
        String url = sc.nextLine();
        File file = new File(url);
        HashMap<String,Integer> hashMap = new HashMap<>();
        method(file,hashMap);
        Set<String> strings = hashMap.keySet();
        for (String key : strings) {
            Integer integer = hashMap.get(key);
            System.out.println(key + "类型的文件有 " + integer + "个");
        }
    }

    public static void method(File file, HashMap<String,Integer> hashMap) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isDirectory()) {
                   method(file1,hashMap);
                } else {
                    String name = file1.getName();
                    String[] split = name.split("\\.");
                    String s = split[split.length - 1];
                    if (!hashMap.containsKey(s)) {
                        hashMap.put(s, 1);
                    } else {
                        hashMap.put(s, hashMap.get(s) + 1);
                    }
                }
            }
        }
    }
}
