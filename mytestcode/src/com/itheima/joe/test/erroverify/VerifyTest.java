package com.itheima.joe.test.erroverify;

import org.junit.Test;

import java.io.*;

public class VerifyTest {
    @Test
    public void test01() throws IOException {
        //读和写都是同个文件，产生的问题
        /*
            分析如下 ：当new FileReader("test.txt") 的时候 读的是原文件
                    但是 当 new FilerWriter("test.txt")的时候 会把原文件覆盖 产生一个新的空的 test.txt文件
         */
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
        String str = br.readLine();
        if(str !=null){
            bw.write("官網：" + str);
            bw.flush();
        }

        bw.close();
        br.close();
    }
}
