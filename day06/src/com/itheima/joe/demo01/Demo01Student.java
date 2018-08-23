package com.itheima.joe.demo01;

public class Demo01Student {
    public static void main(String[] args) {
        //无参构造使用
        Student s = new Student();
        s.setName("舒畅");
        s.setAge(18);
        System.out.println(s.getName()+"‐‐‐"+s.getAge());

        //带参构造使用
        Student s2 = new Student("赵丽颖",18);
        System.out.println(s.getName()+"‐‐‐"+s.getAge());
    }
}
