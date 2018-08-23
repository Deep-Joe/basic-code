package com.itheima.joe.test01;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标插上了，，，");
    }

    @Override
    public void close() {
        System.out.println("鼠标拔掉了，，，");
    }

    public void click() {
        System.out.println("点击鼠标");
    }
}
