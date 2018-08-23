package com.itheima.joe.test;

public class Test03 {
    /*
    第四题：分析以下需求，并用代码实现
	要求:完成代码(按照标准格式写)，然后在测试类中测试。
		1.手机类Phone
		  属性:品牌brand,价格price
		  无参构造,有参构造
		  行为:打电话call,发短信sendMessage,玩游戏playGame
		2.测试类
		  创建Phone类对象,调用Phone类中的方法

		  思考:假设所有的手机都有属性屏幕的尺寸(int size),而且假设所有手机的屏幕尺寸为6,应该如何实现?
     */
    public static void main(String[] args) {
        Phone.size = 6;
        Phone phone = new Phone("苹果",5388.0);
        phone.playGame();
        phone.sendMessage();
        phone.call();
        System.out.println(phone.getBrand() + "手机屏幕尺寸：" + phone.size);

    }
}
