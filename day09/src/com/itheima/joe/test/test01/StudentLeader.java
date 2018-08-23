package com.itheima.joe.test.test01;

public class StudentLeader extends Student{
    /*
    4.根据学生类，创建一个学生干部类 StudentLeader
        增加属性：
            职务job；
        增加方法：开会meeting。
     */
    private String job;

    public StudentLeader() {
    }

    public StudentLeader(String name, String gender, int age, String nationality, String job) {
        super(name, gender, age, nationality);
        this.job = job;
    }

    public String getJob() {

        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void meeting() {
        System.out.println("我是学生领导，我正在开会");
    }
}
