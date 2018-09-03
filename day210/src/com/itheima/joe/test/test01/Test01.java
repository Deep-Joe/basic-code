package com.itheima.joe.test.test01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //第一题：分析以下需求，并用代码实现
        //	实现一个验证程序运行次数的小程序，要求如下：
        //	1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
        //	2.程序运行演示如下:
        //		第一次运行控制台输出: 欢迎使用本软件,第1次使用免费~
        //		第二次运行控制台输出: 欢迎使用本软件,第2次使用免费~
        //		第三次运行控制台输出: 欢迎使用本软件,第3次使用免费~
        //		第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~
        getAppCount();
    }

    private static void getAppCount() throws IOException {
        //1.加载配置文件
        File file = new File("count.properties");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fileReader = new FileReader(file);
        //创建属性集合
        Properties properties = new Properties();
        //加载配置信息到集合中
        properties.load(fileReader);
        fileReader.close();
        //获取time属性值
        String value = properties.getProperty("time");
        //设置运行的次数
        int count = 0;
        //如果value不为null,
        if (value != null) {
            //将value值赋值给count;
            count = Integer.parseInt(value);
            if (count >= 4) {
                System.out.println("第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~");
                throw new RuntimeException("第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~");
            } else {
                System.out.println("第" +  (count + 1 ) + "次运行控制台输出: 欢迎使用本软件,第" + (count + 1 ) + "次使用免费~");
            }
        } else {
            System.out.println("第" + (count + 1 ) + "次运行控制台输出: 欢迎使用本软件,第" + (count + 1 ) + "次使用免费~");
        }
        //运行次数自增
        count++;
        //设置配置文件的属性值
        properties.setProperty("time", count + "");
        //将新的配置信息写入到配置文件中
        FileWriter fileWriter = new FileWriter(file);
        properties.store(fileWriter, "");
        fileWriter.close();

    }
}
