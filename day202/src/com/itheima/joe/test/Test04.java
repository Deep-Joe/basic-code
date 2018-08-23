package com.itheima.joe.test;

import java.util.ArrayList;
import java.util.Collection;

//集合转数组
public class Test04 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        Object[] objects = collection.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
