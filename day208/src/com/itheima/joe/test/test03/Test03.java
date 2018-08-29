package com.itheima.joe.test.test03;

import java.io.File;
import java.io.FilenameFilter;

public class Test03 {
    //第三题：使用文件过滤器来打印出D盘下的所有.txt文件名称
    public static void main(String[] args) {
        File file = new File("d:\\");
        method(file);
//        method2(file);
    }
    public static void method(File file) {
        File[] files = file.listFiles(new FileterImpl());
        //list()方法当文件不是目录或者权限不够时会返回null
        if (files != null) {
            for (File file1 : files) {
                if (file1.isFile()) {
                    System.out.println(file1.getName());
                } else {
                    method(file1);
                }
            }
        }
    }
}
