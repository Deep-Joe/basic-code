package com.itheima.joe.test.test02;


import java.io.*;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) throws IOException{
        // 从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字
        //将学生信息保存到D盘下面的stu.txt文件中，一个学生信息占据一行数据。
        //当用户输入end时停止输入。
        //源：输入：控制台 inputSteamReader
        //目的  输出：文件 Writer
        Scanner scanner = new Scanner(System.in);
        System.out.println("录入的学生信息，输入格式为：学号-学生名字：");
        Writer file = new FileWriter("a.txt");
        while (true) {
            String s = scanner.next();
            if ("end".equals(s)) {
                break;
            } else {
                file.write(s + '\r' +'\n');
            }
        }
        file.close();

    }
}
