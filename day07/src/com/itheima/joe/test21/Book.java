package com.itheima.joe.test21;

public class Book {
    /*
        1. 创建水果类Book,类中有两个私有属性：名称name(String类型)，价格price(double类型)，并提供满参构造和get/set方法（不提供空参构造）
     */
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
