package com.itheima.joe.test01;

public class TestPhone {
    public static void main(String[] args) {
        /**
         * 2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
         3.调用三个成员方法,打印格式如下:
         正在使用价格为998元的小米品牌的手机打电话....
         正在使用价格为998元的小米品牌的手机发短信....
         正在使用价格为998元的小米品牌的手机玩游戏....
         */
        Phone phone01 = new Phone("小米",998.0);
        phone01.call();
        phone01.sendMessage();
        phone01.playGame();
        System.out.println("===========================");

        Phone phone02 = new Phone();
        phone02.setBrand("华为");
        phone02.setPrice(1000.0);
        phone02.call();
        phone02.sendMessage();
        phone02.playGame();

//        phone01.comare(3000.0);
    }
}
