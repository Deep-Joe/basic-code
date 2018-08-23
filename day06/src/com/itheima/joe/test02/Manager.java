package com.itheima.joe.test02;

public class Manager {
    /**
     * 1.项目经理类Manager
     * 属性：
     * 姓名name
     * 工号id
     * 工资salary
     * 奖金bonus
     * 行为：
     * 工作work()
     * 工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
     */
    private String name;
    private int id;
    private double salary;
    private double bonus;


    public Manager() {
    }

    public Manager(String name, int id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("工号为" + this.id + "基本工资为" + this.salary + "奖金为" + this.bonus
                + "的项目经理正在努力做着管理工作，分配任务，检查员工提交上来的代码....");
    }
}
