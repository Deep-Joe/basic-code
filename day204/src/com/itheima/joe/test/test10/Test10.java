package com.itheima.joe.test.test10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * 第十题: 分析以下需求，并用代码实现：
 1.定义一个学生类Student，属性：姓名(String name)、班级班号(String class_number)、分数(double score)
 2.初始化数据将若干Student对象存入List集合
 3.以班级为单位,使用Map存储所有该班学生
 4.统计每个班级的总分和平均分
 */
public class Test10 {
    public static void main(String[] args) {
        //key存的是班级号，value存的是学生集合
        HashMap<String, List<Student>> hashMap = new HashMap<>();
        Student student01 = new Student("张三","itheima01",89.0);
        Student student02 = new Student("李三","itheima02",89.0);
        Student student03 = new Student("王三","itheima03",89.0);
        Student student04 = new Student("小三","itheima01",89.0);
        Student student05 = new Student("啊三","itheima02",89.0);
        Student student06 = new Student("流三","itheima02",89.0);
        Student student07 = new Student("赵三","itheima03",89.0);
        Student student08 = new Student("达三","itheima01",89.0);
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student01);
        arrayList.add(student02);
        arrayList.add(student03);
        arrayList.add(student04);
        arrayList.add(student05);
        arrayList.add(student06);
        arrayList.add(student07);
        arrayList.add(student08);
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            if (!hashMap.containsKey(student.getClass_number())) {
                ArrayList<Student> arrayList1 = new ArrayList();
                arrayList1.add(student);
                hashMap.put(student.getClass_number(),arrayList1);
            } else {
                List<Student> studentList = hashMap.get(student.getClass_number());
                studentList.add(student);
            }
        }
        Set<String> strings = hashMap.keySet();
        for (String string : strings) {
            List<Student> students = hashMap.get(string);
            System.out.println(string + ": " + students);
        }
    }
}
