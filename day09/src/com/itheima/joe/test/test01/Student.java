package com.itheima.joe.test.test01;

public class Student extends Person{
    /*
    2.根据人类，创建一个学生类Student
		增加属性：
			学校school、学号stuNumber；
		重写工作方法（学生的工作是学习）。
     */

    public Student() {
    }

    public Student(String name, String gender, int age, String nationality) {
        super(name, gender, age, nationality);
    }

    @Override
    public  void work() {
        System.out.println("学生的工作是学习");
    }
}
