package com.itheima.joe.test.test04;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 第四题：分析以下需求，并用代码实现
 定义Student类包含姓名：String name、年龄：int age、成绩：int score，生成空参、有参构造、set和get方法、toString方法
 1.创建10个学生对象(其中有两个学员信息完全相同)存入集合中
 2.去除重复的学员并遍历打印剩余学员信息(分别利用普通for循环、增强for循环、迭代器遍历)
 3.打印最高分的学员信息
 4.打印平均分
 5.打印不及格的学员信息及数量
 */
public class Test04 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("张三",18,99));
        students.add(new Student("李四",22,85));
        students.add(new Student("王五",20,90));
        students.add(new Student("刘六",18,70));
        students.add(new Student("赵安琪",16,75));
        students.add(new Student("小龙女",18,100));
        students.add(new Student("赵灵儿",16,100));
        students.add(new Student("蕾姆",16,100));
        students.add(new Student("尹诗琪",18,96));
        students.add(new Student("张三",18,99));
        print01(students);
        System.out.println("==========");
        print02(students);
        System.out.println("=============");
        print03(students);
    }

    private static void print03(HashSet<Student> students) {
        //迭代器遍历集合
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
    }

    private static void print02(HashSet<Student> students) {
        //利用增强for循环遍历集合
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void print01(HashSet<Student> students) {
        //将HashSet集合转换成数组，利用普通for循环遍历打印学员信息
        Object[] objects = students.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }

}
