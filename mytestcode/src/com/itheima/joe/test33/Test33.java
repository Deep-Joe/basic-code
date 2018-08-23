package com.itheima.joe.test33;

public class Test33 {
    /*
    三、22.【代码题】
        根据要求完成以下功能：
        ①定义接口Study，要求如下：
        定义抽象方法： void studyLine()

        ②定义类Line，包含空参构造，满参构造和以下成员变量
        就业班emplymentClass（String 型）
        学费   money (int 型)
        生成所有成员变量set/get方法

        ③ 定义类Student，实现Study接口，包含空参构造，满参构造和以下成员变量
         姓名 name（String 型）
        成绩 score  (double 型 )
        所报班级 Line lin
        生成所有成员变量set/get方法
        定义成员方法：void exam(),实现以下功能：判断学员成绩yyy，如果大于60分，打印”您的成绩为yyy,考试通过”,否则打印”您的成绩为yyy,考试不通过”
        实现抽象方法 void studyLine(),输出：输出”您报名的就业班为：zzz,应缴纳学费：sss元。”
        PS：,yyy是score值,zzz是line类的emplymentClass值,sss是line类的money值

        ④ 定义测试类Test，在main方法实现以下功能：
        创建一个Line对像lintest,为其赋值:就业班为：黑马班，学费为：19980。
        Student对象stu，使用set方法为其赋值：姓名为张三，成绩为88，所报班级：lintest。
        调用exam(),studyLine()两个方法。实现效果如下：
*/
    public static void main(String[] args) {
        Line linest = new Line("黑马班",19980);
        Student stu = new Student();
        stu.setName("张三");
        stu.setScore(88.0);
        stu.setLin(linest);
        stu.exam();
        stu.studyLine();
    }
}
