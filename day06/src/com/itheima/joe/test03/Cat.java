package com.itheima.joe.test03;

public class Cat {
    /**
     * 1.猫类Cat
     * 属性:
     * 毛的颜色color
     * 品种breed
     * 行为:
     * 吃饭eat()
     * 抓老鼠catchMouse()
     * 3.调用成员方法,打印格式如下:
     * 花色的波斯猫正在吃鱼.....
     * 花色的波斯猫正在逮老鼠....
     */
    private String color;
    private String breed;

    public Cat() {
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void catchMouse() {
        System.out.println(this.color + "的" + this.breed + "正在逮老鼠");
    }

    public void eat() {
        System.out.println(this.color + "的" + this.breed + "正在吃鱼....");
    }


}
