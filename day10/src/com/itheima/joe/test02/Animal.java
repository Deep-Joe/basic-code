package com.itheima.joe.test02;

public class Animal{
    private int age;

    public Animal() {
    }

    public Animal(int age) {

        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void drink() {
        System.out.println("喝水");
    }

}
