package com.itheima.joe.test24;

public interface Credit {
    /*
    ① 定义接口Credit,包含如下内容：
        抽象方法： void prepaid()
        定义默认方法： void save()，要求：输出"可以存钱"
     */
    public abstract void prepaid();
    public  default void save() {
        System.out.println("可以存钱");
    }

}
