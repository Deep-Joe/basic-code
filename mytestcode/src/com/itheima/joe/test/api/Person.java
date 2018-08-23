package com.itheima.joe.test.api;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }
/*
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        else {
            Person p = (Person)obj;
            return (Objects.equals(p.age,this.age) && this.name.equals(p.name));
        }
    }*/

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null && !(obj instanceof Person)) //两个都为null则报错
            return false;
        Person person = (Person) obj;
        return Objects.equals(person.age, this.age) && this.name.equals(person.name);

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
