package com.itheima.joe.demo02;

public class Demo01StudentArray {
    /**
     * 存储对象的数据，数组容器是固定的，无法适应数据变化的需求
     * @param args
     */
    public static void main(String[] args) {
        //创建学生数组
        Student[] students = new Student[3];

        //创建三个学生对象
        Student student1 = new Student("曹操", 38);
        Student student2 = new Student("刘备", 40);
        Student student3 = new Student("孙权", 18);

        //给数组赋值
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + "----" + students[i].getAge());
        }
    }
}
