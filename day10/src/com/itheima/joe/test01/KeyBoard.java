package com.itheima.joe.test01;

public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("键盘插上了，，，");
    }

    @Override
    public void close() {
        System.out.println("键盘拔掉了，，，");
    }

    public void type() {
        System.out.println("键盘输入，，，");
    }
}
