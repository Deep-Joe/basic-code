package com.itheima.joe.test.innerclass;

public class Student {
    String s = "张三";
    class Inner {
        public void show() {
            System.out.println(Student.this.s);
        }
    }
}
