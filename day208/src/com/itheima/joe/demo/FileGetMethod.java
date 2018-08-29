package com.itheima.joe.demo;

import java.io.File;
import java.io.IOException;

public class FileGetMethod {
    //File getAbsoluteFile()
    //返回此抽象路径名的绝对形式。
    //String getAbsolutePath()
    //返回此抽象路径名的绝对路径名字符串。
    //File getCanonicalFile()
    //返回此抽象路径名的规范形式。
    //String getCanonicalPath()
    //返回此抽象路径名的规范路径名字符串。
    //long getFreeSpace()
    //返回分区未分配的字节数 named此抽象路径名。
    //String getName()
    //返回由此抽象路径名表示的文件或目录的名称。
    //String getParent()
    //返回此抽象路径名的父 null的路径名字符串，如果此路径名未命名为父目录，则返回null。
    //File getParentFile()
    //返回此抽象路径名的父，或抽象路径名 null如果此路径名没有指定父目录。
    //String getPath()
    //将此抽象路径名转换为路径名字符串。
    //long getTotalSpace()
    //通过此抽象路径名返回分区 named的大小。
    //long getUsableSpace()
    //返回上的分区提供给该虚拟机的字节数 named此抽象路径名。
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\ideawork\\basic-code\\day208\\a.txt");

        //在IDEA中相对路径是在basic-code(大项目)下，不是在day08(模块)下
        File f2 = new File("a.jpg");
        System.out.println(f2.getAbsoluteFile());

        //E:\ideawork\basic-code\a.jpg
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getCanonicalFile());

        //找不到文件或者文件名不存在 输入0
        System.out.println(f2.length());
    }
}
