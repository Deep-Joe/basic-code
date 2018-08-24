package com.itheima.joe.test.test10;
// 1.定义一个学生类Student，属性：姓名(String name)、班级班号(String class_number)、分数(double score)
public class Student {
    private String name;
    private String class_number;
    private Double score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", class_number='" + class_number + '\'' +
                ", score=" + score +
                '}';
    }

    public Student() {
    }

    public Student(String name, String class_number, Double score) {

        this.name = name;
        this.class_number = class_number;
        this.score = score;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass_number() {
        return class_number;
    }

    public void setClass_number(String class_number) {
        this.class_number = class_number;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
