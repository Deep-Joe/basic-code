package com.itheima.joe.test.test13;

import java.util.Arrays;

public class ComarableTest {
    public static void main(String[] args) {
        Student stu[] = {new Student("liusan", 20, 90.0f),
                new Student("lisi", 22, 90.0f),
                new Student("wangwu", 20, 99.0f),
                new Student("sunliu", 22, 100.0f)};
        Arrays.sort(stu);
        for (Student student : stu) {
            System.out.println(student);
        }

    }
}
