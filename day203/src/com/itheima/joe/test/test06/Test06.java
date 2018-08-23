package com.itheima.joe.test.test06;

import java.util.HashSet;

//六、定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储。
//覆盖Object类中的hashCode()和equals()方法
public class Test06 {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("王小二",18));
        people.add(new Person("王小3",18));
        people.add(new Person("王小二",18));
        System.out.println(people);
    }
}
