package com.itheima.joe.test24;




public abstract class Card {
    /*
    ② 定义抽象类Card，要求如下：
         包含空参、满参构造和以下成员变量
        所属银行name（ String 型）
        生成所有成员变量set/get方法
        定义抽象方法：void  cardholder(Person p)
     */
    private String name;

    public Card() {
    }

    public Card(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void cardholder(Person p);
}
