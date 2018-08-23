package com.itheima.joe.test.test02;

public class Worker {
    /*
    	3.要求:向上抽取一个父类,让这两个类都继承这个父类,共有的属性写在父类中，子类重写父类中的方法
     */
    private String name;
    private String id;
    private double salary;

    public Worker() {
    }

    public Worker(String name, String id, double salary) {

        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {}

}
