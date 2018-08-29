package com.itheima.joe.demo;

import java.io.File;
import java.io.IOException;

public class Create {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\Joe\\Desktop\\haha.txt");
        System.out.println("f1.createNewFile() =" + f1.createNewFile());
        System.out.println(f1.delete());
    }
}
