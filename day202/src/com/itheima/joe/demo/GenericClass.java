package com.itheima.joe.demo;

public class GenericClass<E> {
    private E name;

    public GenericClass() {
    }

    public GenericClass(E name) {

        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public<K> void genericMethod01(K key) {
        System.out.println(key);
    }
    //静态方法不能与成员方法重名
    public static<V> void genericMethod02(V value) {
        System.out.println(value);
    }
}
