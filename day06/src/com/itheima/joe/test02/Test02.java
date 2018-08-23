package com.itheima.joe.test02;

public class Test02 {
    /**
     * 1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，setter和getter方法
     2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
     */
    public static void main(String[] args) {
        Manager manager = new Manager("Joe",123,15000.0,6000);
        manager.work();
        System.out.println("======================");
        Coder coder = new Coder();
        coder.setId(135);
        coder.setName("张三");
        coder.setSalary(10000.0);
        coder.work();
    }
}
