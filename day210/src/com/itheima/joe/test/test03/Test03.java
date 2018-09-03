package com.itheima.joe.test.test03;

import java.io.*;
import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //第三题：分析以下需求，并用代码实现
        //	1.定义学生类,包含姓名(String name),性别(String gender),年龄(int age)三个属性,生成空参有参构造,set和get方法,toString方法
        //	2.创建4个学生对象,将4个学生对象存入到ArrayList集合中
        //	3.将存有4个学生对象的ArrayList集合对象写入到D:\\StudentInfo.txt文件中
        //	4.读取D:\\StudentInfo.txt文件中的ArrayList对象并遍历打印
        //	5.要求使用序列化流来实现
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",18,"男"));
        list.add(new Student("李三",18,"女"));
        list.add(new Student("王三",18,"女"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("StudentInfo.txt"));
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("StudentInfo.txt"));
        ArrayList<Student> readList =(ArrayList<Student>) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(readList);
    }


}
