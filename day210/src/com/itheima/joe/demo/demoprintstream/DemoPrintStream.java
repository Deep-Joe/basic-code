package com.itheima.joe.demo.demoprintstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class DemoPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(97);
        PrintStream ps = new PrintStream("a.txt");
        System.setOut(ps);
        //保持数据的表示形式
        ps.println(97);
        //向输出流写入一个字节。要写入的字节是参数 b 的八个低位。b 的 24 个高位将被忽略
        //解析成a
        ps.write(97);
        ps.close();
//        PrintWriter pw = new PrintWriter("a.txt");
//        pw.println(97);
//        pw.close();
    }
}
