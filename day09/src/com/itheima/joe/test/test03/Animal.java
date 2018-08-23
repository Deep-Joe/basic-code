package com.itheima.joe.test.test03;

public abstract class Animal {
    /*
    	1.定义动物类
		属性：
			年龄，颜色
		行为:
			eat(String something)方法(无具体行为,不同动物吃的方式和东西不一样,something表示吃的东西)
			生成空参有参构造，set和get方法

     */
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {

        this.age = age;
        this.color = color;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat(String somthing);

}
