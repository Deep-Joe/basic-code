package com.itheima.joe.test25;

import java.util.ArrayList;

public class Test25 {
    /*
    第五题:
        1.定义"学员"类Student,类中包含以下成员:
          成员属性: num (学号)：int类型, score(成绩):double类型，属性使用private修饰
                 为所有属性提供set/get方法
        2. 定义类：Test,类中定义main()方法，依次完成以下要求:
        2.1 实例化3个Stu对象，3个对象的属性分别为：1001, 55.0、1002, 66.6、1003, 77.0
        2.2 创建一个ArrayList集合，分别将上面的3个Stu对象添加到集合中
        2.3 遍历集合，删除集合中分数不及格的元素，并打印集合中剩余元素的学号和成绩
     */
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student student01 = new Student(1001,55.0);
        Student student02 = new Student(1002,66.6);
        Student student03 = new Student(1003,77.0);
        list.add(student01);
        list.add(student02);
        list.add(student03);
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getScore() < 60.0) {
                list.remove(s);
                i--;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNum() + "-------" + list.get(i).getScore());
        }
    }
}
