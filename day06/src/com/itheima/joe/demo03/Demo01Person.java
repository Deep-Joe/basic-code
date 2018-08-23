package com.itheima.joe.demo03;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Joe");
        person.setAge(18);
        person.setSex(true);
        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.isSex());
    }
}
