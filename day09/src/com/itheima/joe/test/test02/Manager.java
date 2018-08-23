package com.itheima.joe.test.test02;

public class Manager extends Worker {
    /*
    	1.定义项目经理类
		属性：
			姓名 工号 工资 奖金
		行为：
			工作work
     */

    private double bonus;

    public Manager() {
    }

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("我是項目经理， 我在工作。。。");
    }
}
