package com.itheima.joe.test04;

public abstract class Animal {
    /*
     a)	成员变量:int 年龄(age), int 腿的个数(numOfLegs)
     b)	抽象方法: void eat()
     c)	提供空参和满参构造方法和set/get方法
     */
    private int age;
    private int numOfLegs;

    public Animal(int age, int numOfLegs) {
        this.age = age;
        this.numOfLegs = numOfLegs;
    }

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
    public void eat(){}
}
