package com.itheima.joe.test01;

public class Test04 {
    public static void main(String[] args) {
        showColor("red");
    }

    /**
     * 定义showColor方法，根据英文单词，输出对应的颜色
     */
    public static void showColor(String color) {
        switch (color) {
            case "red":
                System.out.println(color + "是红色！");
                break;
            case "blue":
                System.out.println(color + "是蓝色！");
                break;
            case "yellow":
                System.out.println(color + "是黄色！");
                break;
            default:
                System.out.println("不合法字符串！");
                break;
        }
    }
}
