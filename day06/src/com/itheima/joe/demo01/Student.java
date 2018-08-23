package com.itheima.joe.demo01;

public class Student {
    private String name;

    public Student() {
    }

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public void eat() {
        System.out.println("吃饭饭");
    }

    public void sleep() {
        System.out.println("睡觉觉");
    }

    public void study() {
        System.out.println("学习");
    }
}
