package com.itheima.joe.test02;

public class Coder {
    /**
     * 属性：
     * 姓名name
     * 工号id
     * 工资salary
     * 行为：
     * 工作work()
     * 工号为135基本工资为10000的程序员正在努力的写着代码......
     */
    private String name;
    private int id;
    private double salary;


    public Coder(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Coder() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("工号为" + this.id + "基本工资为" + this.salary
                + "的程序员正在努力的写着代码");
    }
}
