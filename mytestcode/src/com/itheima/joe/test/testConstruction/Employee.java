package com.itheima.joe.test.testConstruction;

public class Employee extends Person{
    String name = "000";
    public Employee(String name) {
        //子类继承父类，父类没有无参的构造方法则，必须显示调用父类的构造方法，否则编译报错。
        //总之子类必须调用父类的构造方法
        super(name);
        this.name = name;
    }
}
