package com.itheima.joe.test01;

public class Phone {
    /**
     * 手机类Phone
     * 属性:
     * 品牌brand
     * 价格price
     * 行为:
     * 打电话call()
     * 发短信sendMessage()
     * 玩游戏playGame()
     * 1.按照以上要求定义类,属性要私有,生成空参、有参构造，setter和getter方法
     */
    private String brand;
    private double price;


//    public boolean comare(double price) {
//        return this.price > price;
//    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void call() {
        System.out.println("正在使用价格为" + this.price + "元的" + this.brand + "品牌的手机打电话...");
    }

    public void sendMessage() {
        System.out.println("正在使用价格为" + this.price + "元的" + this.brand + "品牌的手机发短信...");
    }

    public void playGame() {
        System.out.println("正在使用价格为" + this.price + "元的" + this.brand + "品牌的手机玩游戏...");
    }

}
