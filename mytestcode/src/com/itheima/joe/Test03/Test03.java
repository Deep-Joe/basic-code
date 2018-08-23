package com.itheima.joe.Test03;

import java.util.ArrayList;

public class Test03 {
    /**
     * 1.定义一个水果类Fruit，水果具有私有化属性：name属性（名字，String类型）和price(价格，double类型)，创建属性对应的set/get方法，并只提供满参构造方法
     2.定义一个Test类，Test类中包含2个方法：editPric和main方法，2个方法的定义具体如下：
     1）定义int editPric(ArrayList<Fruit> list,int price)静态方法，方法内要求完成：
     如果指定集合list中元素的价格小于指定数值price，就将该元素的价格修改成price,并返回修改了几个水果的价格
     2）创建main方法进行测试，方法内要求完成：
     3.	添加3个Fruit对象到ArrayList集合list中，3个对象对应的属性值为：
     "香蕉",8.00  "西瓜",12.00  "苹果",13.50；
     4.	调用方法editPric传递list和11，之后在控制台上打印修改之后的集合中水果的所有属性与修改了多少个水果
     */
    public static void main(String[] args) {
        ArrayList<Fruit> list = new ArrayList<>();
        Fruit b = new Fruit("香蕉",8.00);
        Fruit w = new Fruit("西瓜",12.00);
        Fruit a = new Fruit("苹果",13.50);
        list.add(b);
        list.add(w);
        list.add(a);
        int count = editPric(list,11);
        for (int i = 0; i < list.size(); i++) {
            Fruit fruit = list.get(i);
            System.out.println(fruit.getName() + "------" + fruit.getPrice());
        }
        System.out.println("修改了" + count + "水果。");
    }
    public static int editPric(ArrayList<Fruit> list, int price) {
        int count = 0; //修改水果价格的个数
        for (int i = 0 ; i < list.size(); i++) {
            Fruit fruit = list.get(i);
            if (fruit.getPrice() < price) {
                 fruit.setPrice(price);
                 count++;
            }
        }
        return count;
    }
}
