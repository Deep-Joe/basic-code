package com.itheima.joe.test04;

public class Rabbit extends Herbivore {
    /**
     * a)	重写eat()方法
     i.	输出格式: 年龄为 XX岁的YY条腿的兔子在吃狗尾草
     b)	提供空参和满参构造方法
     */
    public Rabbit(int age, int numOfLegs) {
        super(age, numOfLegs);
    }

    public Rabbit() {
    }

    @Override
    public void eat() {
        System.out.println("年龄为 " + this.getAge() + "的" + this.getNumOfLegs() +"条腿的兔子在吃狗尾草");
    }
}
