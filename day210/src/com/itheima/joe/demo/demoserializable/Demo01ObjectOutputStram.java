package com.itheima.joe.demo.demoserializable;

import java.io.*;

public class Demo01ObjectOutputStram {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.txt"));
        objectOutputStream.writeObject(new Person("张三",12));
        objectOutputStream.close();
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.txt"));
        Person o = (Person)inputStream.readObject();
        inputStream.close();
        System.out.println(o);

    }
}
