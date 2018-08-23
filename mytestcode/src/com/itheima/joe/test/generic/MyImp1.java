package com.itheima.joe.test.generic;

public class MyImp1 implements GenericInterface<String> {
    @Override
    public void add(String s) {
        System.out.println(s + "实现类就确定泛型的类型");
    }

    @Override
    public String getE() {
        return null;
    }
}
