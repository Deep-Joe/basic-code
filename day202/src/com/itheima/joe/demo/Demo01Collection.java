package com.itheima.joe.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Demo01Collection {
    /*
    共性的方法
    pubilic boolean add(E e):把给定的对象添加到集合中
    public void clear(): 清空集合所有的元素
    public boolean remove(): 把给定的元素在当前集合中删除
    public boolean contains(E e)：判断当前集合是否包含给定的对象
    public boolean isEmpty(): 判断当前集合是否为空
    public Object[] toArray(): 返回包含此collection中所有元素的数组。
     */
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();//多态：向上转型
        collection.add("张三");
        collection.add("李四");
        collection.add("王五");
        System.out.println(collection.toString());
        collection.clear();//打印集合: []
//        collection.remove("张三");
        System.out.println(collection.remove("赵六")); //打印false
        Object[] objects = collection.toArray(); //java.lang.ClassCastException: 数组是个容器没法强转
        String[] strings = (String[])collection.toArray();
       for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
