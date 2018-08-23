package com.itheima.joe.test05;

public class Test05 {
    /**
     * 1. 定义抽象员工类(Employee)
     a)	属性: string 工号(id),string姓名(name)和int工资(salary)
     b)	抽象方法 void  work()
     c)	提供空参,满参构造方法和set/get方法
     2. 定义表演接口(Actor)
     a)	抽象方法void  play()
     3. 定义开发部员工类(Developer)  继承 Employee
     a)	实现抽象方法work()
     i.	输出格式: 工号为XXX的开发部员工YYY在开发JavaEE应用
     b)	提供空参,满参构造方法
     4. 定义会表演的开发部员工类(ActedDeveloper)  继承 Developer实现 Actor接口
     a)	实现抽象方法 play
     i.	输出格式: 工号为XXX的开发部员工YYY在唱歌
     b)	提供空参,满参构造方法
     5. 老板类（Boss）
     a)	属性: int年龄age,String姓名 name
     b)	行为:
     i.	安排工作(void letWork(Employee e))
     1.	调用e对象的工作work方法
     ii.	组织表演(void letPlay(Actor a))
     1.	调用a对象的,表演play方法.
     c)	提供空参,满参构造方法;set/get方法
     6. 测试类Test
     a)	提供main方法
     b)	在main方法中
     i.	创建会表演的开发部员工类(ActedDeveloper) 对象ad,工号赋值为010,姓名赋值为林俊杰,工资赋值为10000
     ii.	创建老板(Boss)对象,姓名赋值为薛之谦,年龄赋值为30
     1.	调用letWork(Employee e)方法
     2.	调用letPlay(Actor a)方法
     */
    public static void main(String[] args) {
        ActedDeveloper ad = new ActedDeveloper("010","林俊杰",10000);
        Boss boss = new Boss(30,"薛之谦");
        boss.letWork(ad);
        boss.letPlay(ad);

    }
}
