package com.itheima.joe.test.test03;

public class Test03 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Person p = new Person();
        p.keepPet(dog,"骨头");
        p.keepPet(cat,"鱼");
    }
}
