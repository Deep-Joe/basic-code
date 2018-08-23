package com.itheima.joe.test01;

import java.math.BigDecimal;
import java.util.ArrayList;

interface Inter {
    void show();
}
class Outer{
    //补齐代码
   public static Inter method() {
        Inter inter = new Inter() {
            public void show() {
                System.out.println("HelloWorld");
            }
        };
        return inter;
    }
}
public class OuterDemo {
    public static void main(String[] args) {
        Outer.method().show();
    }
}
