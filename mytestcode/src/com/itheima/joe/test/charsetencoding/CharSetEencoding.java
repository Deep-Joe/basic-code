package com.itheima.joe.test.charsetencoding;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class CharSetEencoding {
    @Test
    public void test01() throws UnsupportedEncodingException {
        String name = "你好";
        byte[] bytes = name.getBytes();
        String name2 = new String(bytes,"ISO8859-1");
        byte[] bytes1 = name2.getBytes("iso8859-1");
        String name3 = new String(bytes1,"utf-8");
        System.out.println(name3);

    }
}
