package com.itheima.joe.test02;

public class Test02 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal frog = new Frog();
        Animal sheep = new Sheep();
        Worker worker = new Worker();
        worker.feed(dog);
        worker.feed(frog);
        worker.feed(sheep);
    }
}
