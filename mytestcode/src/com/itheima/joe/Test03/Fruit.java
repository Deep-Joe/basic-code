package com.itheima.joe.Test03;

public class Fruit {
    /**
     * 水果具有私有化属性：name属性（名字，String类型）和price(价格，double类型)，创建属性对应的set/get方法，并只提供满参构造方法
     */
    private  String name;
    private double price;

    public Fruit(String name, double price) {
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
