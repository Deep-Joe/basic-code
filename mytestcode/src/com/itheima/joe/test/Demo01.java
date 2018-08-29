package com.itheima.joe.test;

import java.util.HashMap;

public class Demo01 {
    public static void main(String[] args) {
        Integer obj1 = new Integer(1);
        Integer obj2 = new Integer(128);
        System.out.print("Values of obj1 & obj2 before wrapper modification: ");
        System.out.println("obj1 = " + obj1.intValue() + " ; obj2 = " + obj2.intValue());
        modifyWrappers(obj1, obj2);
        System.out.print("Values of obj1 & obj2 after wrapper modification: ");
        System.out.println("obj1 = " + obj1.intValue() + " ; obj2 = " + obj2.intValue());
    }
    private static void modifyWrappers(Integer x, Integer y)
    {
        x = new Integer(5);
        y = new Integer(10);
    }
}
