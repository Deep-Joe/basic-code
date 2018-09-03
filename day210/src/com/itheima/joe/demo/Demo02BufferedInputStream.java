package com.itheima.joe.demo;

import java.io.*;

public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("buffered.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }
        bufferedInputStream.close();

    }
}
