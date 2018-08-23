package com.itheima.joe.test;

/*
一个java 文件可以写多个类 但是只能有一个public类
内部类访问的特点：
1.内部类可以直接访问外部类中的成员
2.外部类要访问内部类，必须建立内部类的对象

分析事物时，发现该事物描述中还有事物， 而且这个事物还在访问被描述事物的内容
这时就是'还有的事物'定义成内部类来描述
 */
public class InnerClassDemo {
    public static void main(String[] args) {
//        Outer out = new Outer();
//        out.method();

//        Outer.Inner in = new Outer().new Inner(); //直接访问外部类中的内部类中的成员
//        in.show();

//        Outer.Iner in = new Outer.Inner();  //如果内部类是静态的，
//        in.show();

        /*
        为什么内部类能直接访问外部类中成员呢？
        那是因为内部类持有了外部类的引用。  外部类名.this
        */
        Outer out = new Outer();
        out.method();
    }
}

class Outer {
    private static int num = 31;

    int OInum = 5;

    /*static*/ class Inner {
        //内部类
        int OInum = 15;
        void show() {
            int OInum = 25;
            //System.out.println("show run,,,," +num);
            System.out.println("内部类的成员变量：" +this.OInum );
            System.out.println("外部类的成员变量：" +Outer.this.OInum );
            System.out.println("内部类中的局部变量：" + OInum);
        }
       /* static void function() { //如果内部类中定义了静态成员，该内部类也必须是静态的
            System.out.println("function run,,, static " + num );
        }*/
    }
    public void method() {
        Inner in = new Inner();
        in.show();
    }
}
