package com.itheima.joe.test;

public class DuoTaiDemo {
    public static void main(String[] args) {
        /*Fu f = new Zi();
        System.out.println(f.num); //打印fu类的3
        System.out.println(f.num_fu); //父类存在的成员变量，但子类不存在 照样运行成功
                        //说明多态时 引用类型是父类  调用成员变量跟子类的成员变量没有关系*/
       /* Fu f1 = new Zi();
        f1.show(); //父类有的函数，子类覆盖的话调用子类的*/

        Fu.method(); //调用父类的静态方法
        Fu f2 = new Zi();
        f2.method();    //调用父类的静态方法

    }

    public static int add(int a, int b) {
        return 0;
    }
    public static int add(int c, float d) {
        return 0;
    }
    public static int add(int a, int b, int c) {
        return 0;
    }
    public static String add(int a, int b, Long c) {
        return "";
    }

}
