package com.itheima.joe.demo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) {
        method01(new File("a.txt"));
    }
    private static void method01(File file)  {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            char[] ch = new char[1024];
            int len ;
            while ((len = fileReader.read(ch)) != -1) {
                System.out.print(new String(ch,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
