package com.itheima.joe.test;

import org.junit.Test;

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
        System.out.println(b);
    }
}
