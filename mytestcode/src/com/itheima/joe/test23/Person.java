package com.itheima.joe.test23;

public class Person {
    /*
    1.定义Person类, 包含以下成员:
成员属性:
    name (姓名)：String类型;
    height (身高) ：double类型;
    weight (体重) ：int类型，
    属性使用private修饰。
成员方法:
    1).get/set方法
    2).无参无返回值的非静态showBMI()方法, 打印对象的姓名,体重,身高和体质指数
    体质指数=体重÷(身高*身高):
     */
    private String name;
    private double height;
    private int weight;

    public Person() {
    }

    public Person(String name, double height, int weight) {

        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //    2).无参无返回值的非静态showBMI()方法, 打印对象的姓名,体重,身高和体质指数
    //    体质指数=体重÷(身高*身高):
    public void showBMI() {
        System.out.println("姓名: " + this.getName() + "，体重：" +
                this.getWeight() + ", 身高：" + this.getHeight() + "，体质指数：" + (this.getWeight() / (Math.pow(this.height,2))) );
    }

}
