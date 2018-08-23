package com.itheima.joe.test05;

public abstract  class Employee {
    /**
     *1. 定义抽象员工类(Employee)
     a)	属性: string 工号(id),string姓名(name)和int工资(salary)
     b)	抽象方法 void  work()
     c)	提供空参,满参构造方法和set/get方法
     */
    private String id;
    private String name;
    private int salary;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){}
}
