package com.itheima.joe.test.innerclass;
//测试在内部类中引用:外部类名.this.成员变量
public class Test {
    public static void main(String[] args) {
        Student.Inner inner = new Student().new Inner();
        inner.show();
    }
}
