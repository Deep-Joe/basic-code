package com.itheima.joe.test24;

public class Test24 {
    /*
    4.【代码题】
根据要求完成以下功能：
① 定义接口Credit,包含如下内容：
        抽象方法： void prepaid()
        定义默认方法： void save()，要求：输出"可以存钱"
② 定义抽象类Card，要求如下：
         包含空参、满参构造和以下成员变量
        所属银行name（ String 型）
        生成所有成员变量set/get方法
        定义抽象方法：void  cardholder(Person p)
③定义类Person
       包含空参、满参构造和以下成员变量
       姓名name（ String 型）
        生成所有成员变量set/get方法
④ 定义类ICBC，要求如下：
继承抽象类 Card，实现接口 Credit
     构造方法包括：空参、满参构造方法(String)
      重写抽象方法：
            void prepaid()，要求：输出”信用卡可以先消费”
            void cardholder(Person p)，要求：输出打印"XXX使用的是YYY信用卡"
PS：XXX是Person类中的 name属性值,YYY是Card类中的 name属性值
⑤ 定义测试类Test，在main方法实现以下功能：
创建并初始化一个ICBC对象bank和一个Person对象 p， 调用bank的 prepaid()、save()和 cardholder(Person p)方法
     */
    public static void main(String[] args) {
        ICBC bank = new ICBC("工商银行");
        Person p = new Person("张三");
        bank.prepaid();
        bank.save();
        bank.cardholder(p);

    }
}
