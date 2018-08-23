package com.itheima.joe.test02;

public class Sheep extends Animal {
    public Sheep() {
    }

    public Sheep(int age) {
        super(age);
    }

    @Override
    public void eat() {
        System.out.println("羊吃草");
    }
}
