package com.itheima.joe.test.classlorad;

import org.junit.Test;

import java.io.InputStream;
import java.net.URL;

public class ClassloadTest {
    @Test
    public void test01() {
        ClassLoader classLoader = ClassloadTest.class.getClassLoader();
        System.out.println(classLoader);
        String path = classLoader.getResource("test.txt").getPath();
        System.out.println(path);
    }
}
