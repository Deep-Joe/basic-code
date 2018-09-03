package com.itheima.joe.test.test02;

import java.io.*;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) throws IOException {
        //第二题：分析以下需求，并用代码实现
        //	1.从键盘接收一个小视频路径
        //	2.将这个视频复制到D盘下avi文件中
        //	3.要求使用缓冲流来实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小视频的路径：");
        String url = sc.nextLine();
        File file = new File(url);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("e://copy.mp4"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
}
