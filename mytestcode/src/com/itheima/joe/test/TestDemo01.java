package com.itheima.joe.test;

import org.junit.Test;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class TestDemo01 {
    @Test
    public void test01() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        System.out.println("===========");
        list.set(0, "000");
        System.out.println(list);
        System.out.println("===========");
        String s1 = list.get(1);
        String[] s2 = s1.split("a");
        System.out.println(s1);
        System.out.println("================");
        System.out.println(Math.round(-11.5));
    }

    @Test
    public void test02() {
        String str = "abc";
        char[] chars = {'a', 'b', 'c'};
        String str1 = new String(chars);
        System.out.println(str == str1);
        System.out.println(str.equals(str1));
    }

    @Test
    public void test03() {
        BigInteger bigInteger = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= 100; i++) {
            BigInteger resut_value = new BigInteger(String.valueOf(i));
            bigInteger = bigInteger.multiply(resut_value);
        }
        System.out.println(bigInteger.toString());
    }

    @Test
    public void test04() {
        BigDecimal bigDecimal = new BigDecimal(1);
        for (int i = 1; i <= 100; i++) {
            BigDecimal result_value = new BigDecimal(i);
            bigDecimal = bigDecimal.multiply(result_value);
        }
        System.out.println(bigDecimal.toString());
    }

    @Test
    public void test05() {
        int i = 1;
        int j = 1;
        char c = '1';
//        j = ++i;
//        j += i++;
//        j += i--;
        boolean flag;
        flag = c == i;
        System.out.println(flag);
        System.out.println(i);
        System.out.println(j);
    }

    @Test
    public void test06() {
        int a = 5;
        int b = 7;
        int c = 3;
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println(max);
    }

    @Test
    public void test07() {
        byte b = 1;
        //b = b + 3; 报错
        b += 3; //通过 因为 b += 3 --> b =(byte)(b + 3);
        System.out.println((byte)(b-1));
    }

    @Test
    public void test08() {
        byte b = -128;
        System.out.println(b);
    }

    @Test
    public void test09() {
        int a = 6;
        int b = a << 2;
        int c = a >> 2;
        System.out.println(b);
        System.out.println(c);
    }

    @Test
    public void test10() throws UnsupportedEncodingException {
        byte[] gbks = "你好".getBytes("gbk");
        for (byte gbk : gbks) {
            System.out.println(gbk);
        }
        String str = "谢谢";

        byte[] buf = str.getBytes("gbk");

        String s1 = new String(buf,"UTF-8");

        System.out.println("s1="+s1);

        byte[] buf2 = s1.getBytes("UTF-8");

        String s2 = new String(buf2,"GBK");

        System.out.println("s2="+s2);
    }

    @Test
    public void test11() throws IOException {
        //测试write()功能
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
        bw.write("传智学院");
        bw.write("传智播客");
        bw.newLine();
        bw.write("黑马程序员");
        bw.close();
    }

    @Test
    public void test12() throws IOException {
        Writer writer = null;
        try {
            writer = new FileWriter("bw.txt");
            writer.write("abc1");
            writer.write("abc2");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test13() {
        //Byte类型的127 加1之后为-128
        Byte b = 127;
        ++b;
        System.out.println(b);
    }

    @Test
    public void test14() {
        int i = Integer.parseInt("200");
        int i1 = Integer.valueOf("200").intValue();
        System.out.println(i == i1);
    }
}
