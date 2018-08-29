package com.itheima.joe.test.test01;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Test1 {
    //一、根据需求、完成代码
    //	1.项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
    //	2. user.txt文件中初始存放的用户信息有如下：
    //		jack,123
    //		rose,123
    //		tom,123
    //	3.要求完成如下功能：
    //	  程序运行时：控制台提示用户输入注册的用户名和密码；
    //	   验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
    //	   是：控制台提示：用户名已存在
    //	   否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功
    public static void main(String[] args) throws IOException{
        //先读取文件中的用户名
        Reader reader = new FileReader("E:\\ideawork\\basic-code\\day209\\src\\com\\itheima\\joe\\test\\test01\\user.txt");
        char[] chars = new char[1024];
        int len;
        String s = "";
        while ((len = reader.read(chars)) != -1) {
             s = new String(chars,0,len);
        }
        //将读取到的用户名存入到Map中
        String[] split = s.split("\\n");
        HashMap<String,String> hashMap = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split(",");
            hashMap.put(split1[0],split1[1]);
        }
        //将输入的用户名与map中的key值比较验证用户名是否重复
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名和密码：格式：用户名，密码,如：aaa,123 ");
        String sin = scanner.next();
        String[] split2 = sin.split(",");
        if (hashMap.containsKey(split2[0])) {
            System.out.println("用户名已存在");
        } else {
            //否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功
            Writer writer = new FileWriter("E:\\ideawork\\basic-code\\day209\\src\\com\\itheima\\joe\\test\\test01\\user.txt",true);
            writer.write(sin + '\n');
            System.out.println("注册成功");
            writer.close();
        }
        reader.close();
    }
}
