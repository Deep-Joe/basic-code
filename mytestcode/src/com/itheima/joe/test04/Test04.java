package com.itheima.joe.test04;

public class Test04 {
    /**
     * 1.	定义抽象类动物类(Animal)
     2.	定义抽象类食肉类动物(Carnivore)继承自动物类(Animal)
     a)	提供空参和满参构造方法
     3.	定义抽象类食草类动物(Herbivore)继承自动物类(Animal)
     a)	提供空参和满参构造方法
     4.	定义老虎类(Tiger)继承食肉类动物(Carnivore)
     a)	重写eat()方法
     i.	输出格式: 年龄为 XX的YY条腿的老虎在吃羊
     (PS:XX为年龄age属性,YY为腿的个数numOfLegs属性,下面重复出现同理)
     b)	提供空参和满参构造方法
     5.	定义兔子类(Rabbit)继承食草动物(Herbivore)
     a)	重写eat()方法
     i.	输出格式: 年龄为 XX岁的YY条腿的兔子在吃狗尾草
     b)	提供空参和满参构造方法
     6.	定义测试类Test
     a)	提供main方法
     b)	在main方法中
     i.	创建老虎对象 t,年龄赋值为2,腿的个数赋值为4;调用老虎对象t的eat()方法
     ii.	创建兔子对象 r,年龄赋值为1,,腿的个数赋值为4;调用兔子对象r的eat()方法
     */
    public static void main(String[] args) {
        Tiger t = new Tiger(2,4);
        Rabbit r = new Rabbit(1,4);
        t.eat();
        r.eat();
    }
}
