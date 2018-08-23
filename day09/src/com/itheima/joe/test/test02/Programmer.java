package com.itheima.joe.test.test02;

public class Programmer extends Worker {
    /*
    	2.定义程序员类
		属性：
			姓名 工号 工资
		行为：
			工作work
     */
    private String name;
    private String id;
    private double salary;

    public Programmer() {
    }

    public Programmer(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("我是程序员，我正在工作。。。");
    }
}
