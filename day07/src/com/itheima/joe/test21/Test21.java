package com.itheima.joe.test21;

import java.util.ArrayList;
import java.util.Scanner;

public class Test21 {
    /*
     * 第一题
     1. 创建水果类Book,类中有两个私有属性：名称name(String类型)，价格price(double类型)，并提供满参构造和get/set方法（不提供空参构造）
     * 2. 定义测试类Test,在测试类中定义两个静态方法：main方法和
     void getBook(ArrayList<Book> list,double num1)方法

     * 	2.1 getBook(ArrayList<Book> list, double num1)方法中依次完成：
     * 		2.1.1 创建新的集合ArrayList<Book> newList;
     * 		2.1.2 查询指定元素list元素中价格大于num1的对象存入newList集合中
     * 		2.1.3 打印newList集合中所有元素对应的属性

     * 	2.2 main方法中一次完成
     * 		2.2.1 创建ArrayList<Book>集合list,存放3个Book对象到list集合中，3个对象的属性值分别为：
     “Java从入门到精通”，23.99；
     “Java设计模式”，32.85；
     “Java虚拟机”，70.65
     * 		2.2.2 键盘录入一个double类型num1,用来作为查询书的价格（录入之前应得到提示“请输入一个价格”）
     * 		2.2.3 传递list和num1调用getBook(ArrayList<Book> list,double num1)方法
     */
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Book book01 = new Book("Java从入门到精通", 23.90);
        Book book02 = new Book("Java设计模式",32.85);
        Book book03 = new Book("Java虚拟机",70.65);
        books.add(book01);
        books.add(book02);
        books.add(book03);
        System.out.println("请输入一个价格：");
        double price = sc.nextDouble();
        getBook(books,price);

    }

    public static void getBook(ArrayList<Book> list, double num1) {
        ArrayList<Book> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            if (b.getPrice() > num1) {
                newList.add(b);
            }
        }
        for (int i = 0; i < newList.size(); i++) {
            Book book = newList.get(i);         //别弄错集合对象
            System.out.println(book.getName() + "-----" + book.getPrice());
        }
    }
}
