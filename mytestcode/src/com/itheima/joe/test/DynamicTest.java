package com.itheima.joe.test;

public class DynamicTest {
    public static void main(String[] args){

        A a1 = new A();
        A a2 = new B();  //向上转型
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println(a1.show(b)); // 自己调用自己的方法并且把他的子类对象传进去 输出 A and A
        System.out.println(a1.show(c));  //自己调用自己的方法并把他的子孙C传进去输出 A and A
        System.out.println(a1.show(d));  //自己调用自己的方法并把他的子孙D传进去输出 A and D
        System.out.println(a2.show(b));  //这是父类调用子类的方法并把它的子类B传进去输出 B and B X [B and A]首先看父类有没有该方法，如果有，则看子类有没有重写
                                        //a2.show(b) 就是a2这个父类1.找有没有 show(B b)的方法 如果没有2.则找 show(b的父类 对象名)
        //                              3.找子类有没有覆盖 show(b的父类 对象名) 如果有则运行该方法 否则执行父类方法
        System.out.println(a2.show(c));   //这是父类调用子类的方法并把它的子孙C传进去输出 B and B  X [B and A]
        System.out.println(a2.show(d));  //这是父类调用子类的方法并把它的子孙D传进去输出 A and D
        System.out.println(b.show(b));   //这是B类调用自己的方法并把自己作为形参传景区输出 B and B
        System.out.println(b.show(c));   //这是B类调用自己的方法并把自己的子类作为行参输出 B and B
        System.out.println(b.show(d));   //这是B类调用自己的方法并自己的子类作为形参输出 B and B X [A and D ] 继承的方法没有重写但是也不要忽略；
    }
}
class A {
    public String show(D obj){
        return ("A and D");
    }
    public String show(A obj){
        return ("A and A");
    }
}
class B extends A{  //B继承了A

    public String show(B obj){
        return ("B and B");
    }
    public String show(A obj){
        return ("B and A");
    }
}
class C extends B{}
class D extends B{}

