package com.itheima.joe.test.test02;

public class Test02 {
    /*
    第三题：分析以下需求，并用代码实现

		编写测试类:完成这两个类的测试
     */
    public static void main(String[] args) {
        Worker w = new Programmer();
        w.work();
        Worker m = new Manager();
        m.work();
    }
}
