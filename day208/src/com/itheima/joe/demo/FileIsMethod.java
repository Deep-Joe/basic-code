package com.itheima.joe.demo;

import java.io.File;

public class FileIsMethod {
    public static void main(String[] args) {
        File f1 = new File("E:\\ideawork\\basic-code\\a.txt");
        File f2 = new File("E:\\ideawork\\basic-code\\a.jpg");
        System.out.println(f1.exists());
        System.out.println(f2.exists());
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());
        System.out.println(f2.length());

    }
}
