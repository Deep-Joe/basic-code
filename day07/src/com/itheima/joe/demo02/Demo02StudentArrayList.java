package com.itheima.joe.demo02;

import java.util.ArrayList;

public class Demo02StudentArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String s1 = "曹操";
        String s2 = "刘备";
        String s3 = "孙权";
        System.out.println(list);
        //将指定元素添加到尾部
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);

        System.out.println("==============");

        //创建学生对象的集合容器
        ArrayList<Student> list1 = new ArrayList<>();
        Student student1 = new Student("司马懿",40);
        Student student2 = new Student("诸葛亮",30);
        Student student3 = new Student("陆逊",20);

        //将学生对象添加到容器尾部
        list1.add(student1);
        list1.add(student2);
        list1.add(student3);

        for (int i = 0; i < list1.size(); i++) {
            Student s = list1.get(i);
            System.out.println(s.getName() + "-------" + s.getAge());
        }



        System.out.println("===============");
        //ArrayList对象不能存储基本类型，只能存储引用类型的数据。
        // 类似 <int> 不能写，但是存储基本数据类型对应的 包装类型是可以的。
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(list2);
        System.out.println("==================");
        list2.remove(0); //移除此集合中指定位置上的元素。返回被删除的元素。
        for (int i = 0; i < list2.size(); i++) {//返回此集合中的元素数。遍历集合时，可以控制索引范围，防止越界。

            System.out.println(list2.get(i));//返回此集合中指定位置上的元素。返回获取的元素。
        }
    }
}
