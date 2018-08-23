package com.itheima.joe.test.test05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 第五题：分析以下需求，并用代码实现
 1.定义一个map集合,key为String类型的姓名,value为String类型地址,存入数据多条数据(假设不存在重名的情况),并用多种方式遍历
 2.定义一个map集合,key为Student类型的对象,value为String类型的地址,存入数据多条数据(需要加入对象的唯一性判断)
 (1)定义一个学生类Student，包含属性：姓名(String name)、年龄(int age)、成绩(int score)
 (2)定义Map集合，用Student对象作为key，用字符串(此表示表示学生的住址)作为value
 (3)利用四种方式遍历Map集合中的内容，格式：key::value
 */
public class Test05 {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();
        map.put(new Student("张三",18,88),"北京");
        map.put(new Student("李四",18,88),"北京");
        map.put(new Student("张三",18,98),"上海");
        Set<Student> students = map.keySet();
        for (Student student : students) {
            System.out.println(student + "::" + map.get(student));
        }
        System.out.println("-------------------------");
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + "::" + entry.getValue());
        }

    }
}
