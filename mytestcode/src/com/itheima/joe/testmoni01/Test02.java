package com.itheima.joe.testmoni01;

public class Test02 {
    /*
    2.按要求定义接口和类,完成以下功能：
a.定义人类Person，要求包含：
  	1)成员变量：姓名 name (String类型)， 年龄  age  (int类型);要求所有字段用private 修饰
  	2)构造方法:空参、满参构造方法；
  	3)成员方法：public void sleep(),无参无返回值，方法内输出“休息是人的本能”
b.定义接口Learning，要求：
  	1)定义抽象方法：public void study(Student stu);
c.定义学生类Student，要求：
  	1)继承Person类，重写sleep方法，方法内打印输出“年龄为xxx的xx学生正在教室睡午觉”
PS:xxx为变量age的值，xx为变量name的值
   	2)成员方法：public void playGame(),方法内输出“年龄为xxx的xx学生在教室玩游戏被老师抓住了”
   	3)实现接口Learning，要求重写study方法，方法内先输出“学习第一,再无手机”
d.定义测试类Test,在main方法实现以下功能:
   创建Person对象，调用sleep方法
   创建Student 对象，先调用sleep方法，再调用playGame方法，最后调用study方法
     */
    public static void main(String[] args) {
        Person person = new Person();
        person.sleep();
        Student student = new Student("小明",18);
        student.sleep();
        student.playGame();
        System.out.println("======================");
        String s = "ab";
        String s1 = "a" + "b";
        System.out.println(s == s1);
        System.out.println(s1.equals(s));

        Person p = new Student();
       // Student s = new Person(); 报错
        String str = "woaiheimaheimaaiwo";
        String s2 = str.substring(0,3);
        System.out.println(str);
//        int arr []= new int[5]{1,2,3,4,5}; 报错
    }
}
