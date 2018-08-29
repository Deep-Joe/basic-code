package com.itheima.joe.test.classlorad;

public class Test {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println("s.count1 = " + s.count1);
        System.out.println("s.count2 = " + s.count2);
    }
}
class Singleton {
    //类加载先把类中静态变量空间分布好，然后从上到下：赋予默认值，初始化将右边的值赋给静态变量
    //首先 s = null; count1 = 0; count2 = 0;
    //然后 s = new Singleton() 初始化构造方法即执行里面的代码 count1 = 1, count2 = 1;  到这执行完了 private static Singleton s = new Singleto();
    //最后 count1 = 0; count2 = 1;
    private static Singleton s = new Singleton();
    public static int count1 = 0;
    public static int count2 ;
    private Singleton() {
        count1++;
        count2++;
    }
    public static Singleton getInstance() {
        return s;
    }
}
