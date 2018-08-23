package com.itheima.joe.test33;

public class Line {
    /*
        ②定义类Line，包含空参构造，满参构造和以下成员变量
        就业班emplymentClass（String 型）
        学费   money (int 型)
        生成所有成员变量set/get方法
     */
    private String emplymentClass;
    private int money;

    public Line() {
    }

    public Line(String emplymentClass, int money) {

        this.emplymentClass = emplymentClass;
        this.money = money;
    }

    public int getMoney() {

        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getEmplymentClass() {

        return emplymentClass;
    }

    public void setEmplymentClass(String emplymentClass) {
        this.emplymentClass = emplymentClass;
    }
}
