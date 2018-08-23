package com.itheima.joe.test02;

public class Test02 {
    public static void main(String[] args) {
        //	要求:在测试类Test中创建A的对象a并调用成员方法methodA(),要求用两种方式实现
        A a = new A();
        //第一種方法實現
        InterA interA = new InterA() {
            @Override
            public void showA() {
                System.out.println("你好啊，Java!");
            }
        };
        a.methodA(interA);
        //第二种方式
        a.methodA(new InterA() {
            @Override
            public void showA() {
                System.out.println("你好啊，Java!!");
            }
        });
    }
}
//定义接口
interface InterA {
    void showA();
}
class A {
    public void methodA(InterA a) {
        a.showA();
    }
}