package com.itheima.joe.test;

public class Zi extends Fu{
    @Override
    public Zi show() {
        System.out.println("zi show ");
        return  new Zi();
    }

    public static void method() {
        System.out.println(" zi static method ");
    }
}
