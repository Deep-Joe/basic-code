package com.itheima.joe.test02;

public class Frog extends Animal implements Swim{

    public Frog() {
    }

    public Frog(int age) {
        super(age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swimming() {
        System.out.println("青蛙会蛙泳");
    }
}
