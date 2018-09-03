package com.itheima.joe.demo;

import java.io.*;

public class Demo04OutputStreamWriter {
    public static void main(String[] args) throws IOException {
//        writ_utf_8();
        read_gbk();
    }

    private static void writ_utf_8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("buffered.txt"));
        osw.write("你好1");
        osw.close();
    }

    private static void read_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk.txt"),"gbk");
        int len;
        while ((len = isr.read()) != -1) {
            System.out.println((char)len);
        }
        isr.close();
    }
}
