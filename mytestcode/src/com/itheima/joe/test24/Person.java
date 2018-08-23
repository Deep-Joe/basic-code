package com.itheima.joe.test24;

public class Person {
    /*
    ③定义类Person
       包含空参、满参构造和以下成员变量
       姓名name（ String 型）
        生成所有成员变量set/get方法
     */
    private String name;

    public Person() {
    }

    public Person(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
