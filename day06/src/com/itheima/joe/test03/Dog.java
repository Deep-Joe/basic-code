package com.itheima.joe.test03;

public class Dog {
    /**
     * 属性:
     毛的颜色color
     品种breed
     行为:
     吃饭()
     看家lookHome()
     黑色的藏獒正在啃骨头.....
     黑色的藏獒正在看家.....
     */
    private String color;
    private String breed;

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public Dog() {
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

    public void eat() {
        System.out.println(this.color + "的" + this.breed + "正在啃骨头....");
    }

    public void lookHome() {
        System.out.println(this.color + "的" + this.breed + "正在看家....");
    }
}
