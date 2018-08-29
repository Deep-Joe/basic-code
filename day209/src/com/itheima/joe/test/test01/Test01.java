package com.itheima.joe.test.test01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //需求：统计一个文件中'a'出现的次数
        InputStream inputStream = new FileInputStream("a.txt");
        int val ;
        int count = 0;
        while ((val = inputStream.read()) != -1) {
            if ((char) val == 'a') {
                count++;
            }
        }
        inputStream.close();
        System.out.println("该文件a出现的次数: " + count);
    }
}
