package com.itheima.joe.test.test03;

public class Cat extends Animal {
    /*
    	3.定义猫类继承动物类
		行为:eat(String something)方法,逮老鼠catchMouse方法(无参数)
     */

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String somthing) {
        System.out.println("猫吃" + somthing);
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
