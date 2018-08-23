package com.itheima.joe.test05;

public class Boss {
    /**
     * 5. 老板类（Boss）
     a)	属性: int年龄age,String姓名 name

     c)	提供空参,满参构造方法;set/get方法
     */
    private int age;
    private String name;

    public Boss(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Boss() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //b)	行为:
    //     i.	安排工作(void letWork(Employee e))
    //     1.	调用e对象的工作work方法
    //     ii.	组织表演(void letPlay(Actor a))
    //     1.	调用a对象的,表演play方法.
    public void letWork(Employee e) {
        e.work();
    }
    public void letPlay(Actor a) {
        a.play();
    }
}
