package com.itheima.joe.testmoni01;

public class Student extends Person implements Learning {

    /*
    c.定义学生类Student，要求：
  	1)继承Person类，重写sleep方法，方法内打印输出“年龄为xxx的xx学生正在教室睡午觉”
PS:xxx为变量age的值，xx为变量name的值
   	2)成员方法：public void playGame(),方法内输出“年龄为xxx的xx学生在教室玩游戏被老师抓住了”
   	3)实现接口Learning，要求重写study方法，方法内先输出“学习第一,再无手机”
     */

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void sleep() {
        System.out.println("年龄为" + this.getAge() + "的" + this.getName() + "学生正在教室睡午觉");
    }

    @Override
    public void study(Student stu) {
        System.out.println("学习第一，再无手机");
    }

    public void playGame() {
        System.out.println("年龄为" + this.getAge() + "的" +
                this.getName() + "学生在教室玩游戏被老师抓住了");
    }

}
