package com.itheima.joe.test.test01;


public class Worker extends Person {
    /*
    	3.根据人类，创建一个工人类Worker
		增加属性：
			单位unit、工龄workAge；
		重写工作方法（工人的工作是盖房子）。
     */

    public Worker() {
    }

    public Worker(String name, String gender, int age, String nationality) {
        super(name, gender, age, nationality);
    }

    @Override
    public void work() {
        System.out.println("工人的工作是盖房子");
    }
}
