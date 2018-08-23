package com.itheima.joe.test.test02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
二、定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
	A：使用迭代器遍历集合。
	B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
 */
public class Test02 {
    public static void main(String[] args) {
        ArrayList<Student> list_Student = new ArrayList<>();
        list_Student.add(new Student("张三", "男", 18));
        list_Student.add(new Student("李四", "女", 17));
        list_Student.add(new Student("王五", "男", 19));
        printList(list_Student);
        change(list_Student);
        System.out.println("------------------");
        printList(list_Student);
        Collection<String> coll = new ArrayList<String>();
        coll.add("水立方");
        coll.add("东方明珠");
        coll.add("大雁塔");
        for (String s : coll) {
            System.out.print(s+"," );
        }
    }

    public static void change(ArrayList<Student> list) {
        int max_age = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (student.getAge() > max_age) {
                max_age = student.getAge();
                index = i;
            }
        }
        Student student = list.get(index);
        student.setName("小猪佩奇");
    }

    public static void printList(ArrayList<Student> list) {
        for (Iterator<Student> iterator = list.iterator(); iterator.hasNext(); ) {
            Student student = iterator.next();
            System.out.println(student);
        }
    }
}
