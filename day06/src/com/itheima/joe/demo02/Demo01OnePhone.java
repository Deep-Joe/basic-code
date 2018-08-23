package com.itheima.joe.demo02;

public class Demo01OnePhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.brand);//null
        System.out.println(phone.price);//0.0
        System.out.println(phone.color);//null
        System.out.println("/////////////");

        phone.brand = "苹果";
        phone.price = 8830.0;
        phone.color = "黑色";
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
        System.out.println("////////////");

        Phone phone2 = new Phone();
        phone2.brand = "三星";
        phone2.price = 5999.0;
        phone2.color = "金色";
        System.out.println(phone2.brand);
        System.out.println(phone2.price);
        System.out.println(phone2.color);
    }
}
