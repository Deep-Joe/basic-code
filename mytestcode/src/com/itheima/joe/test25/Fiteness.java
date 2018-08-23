package com.itheima.joe.test25;

public interface Fiteness {
    /*
    ①  定义接口Fitness，要求如下：
      定义抽象方法： void fitnessPlan(Plan p)
      定义默认方法： void info()，要求：依次调用sport1()，sport2 ()
      定义私有方法： void sport1 (),要求：输出"每天动一动，享受健康生活"
                              void sport2(),要求：输出"记得要做热身运动哦"
     */
    public abstract void fitnessPlan(Plan p);
    public default void info() {
        sport1();
        sport2();
    }

    private void sport1() {
        System.out.println("每天动一动，享受健康生活");
    }

    private void sport2() {
        System.out.println("记得要做热身运动哦");
    }
}
