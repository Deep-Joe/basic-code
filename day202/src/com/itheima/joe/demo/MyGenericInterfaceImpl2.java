package com.itheima.joe.demo;
/*
    含有泛型接口的第二种的实现方式：接口使用什么泛型的，实现类也用什么泛型
    public interface List<E> {
        boolean add(E e);
        E get(int index);
    }
    public ArrayList<E> implements List<E> {
        boolean add(E e) {
            ...
        }
        E get(int index) {
            ...
        }
    }
 */

public class MyGenericInterfaceImpl2<T> implements MyGenericInterface<T> {
    @Override
    public void method(T t) {
        System.out.println(t);
    }
}
