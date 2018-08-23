package com.itheima.joe.test33;


public class Student implements Study {
    /*
   ③ 定义类Student，实现Study接口，包含空参构造，满参构造和以下成员变量
    姓名 name（String 型）
   成绩 score  (double 型 )
   所报班级 Line lin
   生成所有成员变量set/get方法

    */
    private String name;
    private double score;
    private Line lin;

    public Student() {
    }

    public Student(String name, double score, Line lin) {

        this.name = name;
        this.score = score;
        this.lin = lin;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Line getLin() {
        return lin;
    }

    public void setLin(Line lin) {
        this.lin = lin;
    }

    @Override
    public void studyLine() {
        System.out.println("您报名的就业班为：" + lin.getEmplymentClass() + "应缴纳学费：" + lin.getMoney() + "元");
    }

    //  定义成员方法：void exam(),实现以下功能：判断学员成绩yyy，如果大于60分，打印”您的成绩为yyy,考试通过”,否则打印”您的成绩为yyy,考试不通过”
    //   实现抽象方法 void studyLine(),输出：输出”您报名的就业班为：zzz,应缴纳学费：sss元。”
    //   PS：,yyy是score值,zzz是line类的emplymentClass值,sss是line类的money值
    public void exam() {
        if (this.getScore() > 60) {
            System.out.println("您的成绩为" + this.getScore() + ",考试通过");
        } else {
            System.out.println("您的成绩为" + this.getScore() + "考试不通过");
        }
    }

}
