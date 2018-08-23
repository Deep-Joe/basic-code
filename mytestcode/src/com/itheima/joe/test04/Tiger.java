package com.itheima.joe.test04;

public class Tiger extends Carnivore{

    /**
     *  a)	重写eat()方法
     i.	输出格式: 年龄为 XX的YY条腿的老虎在吃羊
        b)	提供空参和满参构造方法
     */
    public Tiger(int age, int numOfLegs) {
        super(age, numOfLegs);
    }

    public Tiger() {
    }

    @Override
    public void eat() {
        System.out.println("年龄为 " + this.getAge() +"的" + this.getNumOfLegs() + "条腿的老虎在吃羊");
    }
}
