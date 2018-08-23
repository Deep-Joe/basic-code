package com.itheima.joe.test02;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(int age) {
        super(age);
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void swimming() {
        System.out.println("狗会游泳狗刨");
    }
}
