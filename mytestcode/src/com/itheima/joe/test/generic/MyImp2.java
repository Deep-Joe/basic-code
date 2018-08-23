package com.itheima.joe.test.generic;

public class MyImp2<E> implements GenericInterface<E> {

    @Override
    public void add(E e) {
        System.out.println(e.toString() + "创建对象时确定泛型的类型");
    }

    @Override
    public E getE() {
        return null;
    }
}
