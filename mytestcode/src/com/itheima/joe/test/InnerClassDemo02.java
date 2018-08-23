package com.itheima.joe.test;

public class InnerClassDemo02 {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.method();
    }
}
/*
匿名内部类
    必须有前提：
    内部类必须继承或者实现一个外部类或者接口
    匿名内部类其实就是一个匿名子类对象
    格式：new 父类or接口名() {};
 */
class Outer02 {
    void method() {
       /* new Demo() {
            public void show() {
                System.out.println("这是一个匿名内部类，其实就是Demo的匿名的子类");
            }
        }.show();*/
       Demo demo = new Demo() {
           public void show01() {
               System.out.println("这是一个方法1");
           }

           public void show02() {
               System.out.println("这是一个方法2");
           }

           public void show3() {
               System.out.println("这是一个子类的方法");
           }
       };

       demo.show01();
       demo.show02();
//       demo.show3(); //因为这个匿名子类被向上转型为Demo接口,不具备子类的特有方法，所以编译错误；
    }

}

interface Demo{
    public abstract void show01();

    public abstract void show02();
}