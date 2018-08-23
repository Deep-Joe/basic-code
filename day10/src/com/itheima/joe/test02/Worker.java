package com.itheima.joe.test02;

public class Worker {
    public void feed(Animal animal) {
        animal.drink();
        animal.eat();
        if (animal instanceof Swim) {
            Swim s = (Swim)animal;
            s.swimming();
        }
    }
}
