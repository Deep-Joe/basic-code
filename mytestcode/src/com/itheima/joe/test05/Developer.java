package com.itheima.joe.test05;

public class Developer extends Employee{
    /**
     *3. 定义开发部员工类(Developer)  继承 Employee
     a)	实现抽象方法work()
     i.	输出格式: 工号为XXX的开发部员工YYY在开发JavaEE应用
     b)	提供空参,满参构造方法
     */
    public Developer(String id, String name, int salary) {
        super(id, name, salary);
    }

    public Developer() {
    }

    @Override
    public void work() {
        System.out.println("工号为" + this.getId() + "的开发部员工" + this.getName() + "在开发JAVAEE应用");
    }
}
