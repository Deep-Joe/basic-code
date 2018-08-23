package com.itheima.joe.demo;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
//        GenericClass<Integer> genericClass = new GenericClass<>();
//        genericClass.setName(1);
//        Integer name = genericClass.getName();
//        System.out.println(name);
//
//        GenericClass<String> genericClass1 = new GenericClass<>("name2");
//        String name2 = genericClass1.getName();
//        System.out.println(name2);

        ArrayList<String> arrayList01 = new ArrayList<>();
        arrayList01.add("abc01");
        arrayList01.add("abc02");
        arrayList01.add("abc03");
        arrayList01.add("abc04");
        arrayList01.add("abc05");
        test01(arrayList01);

        ArrayList<Integer> arrayList02 = new ArrayList<>();
        arrayList02.add(1);
        arrayList02.add(2);
        arrayList02.add(3);
        arrayList02.add(4);
        arrayList02.add(5);
        test01(arrayList02);

//        ArrayList<?> arrayList = new ArrayList<>();
//        arrayList.add(1);

    }

    public static void test01(ArrayList<?> arrayList) {
        System.out.println(arrayList);
    }

    public static void test02() {
        ArrayList<Number> list01 = new ArrayList<>();
        ArrayList<Integer> list02 = new ArrayList<>();
        ArrayList<String> list03 = new ArrayList<>();
        ArrayList<Object> list04 = new ArrayList<>();

//        test02_1(list01);
//        test02_1(list02);
//        test02_1(list03);// String类与Number类无关
//        test02_1(list04);// Number类的父类
//
//        test02_2(list01);
//        test02_2(list02);// Number类的子类
//        test02_2(list03);// String类与Number类无关
//        test02_2(list04);

    }

    private  static void test02_1(ArrayList<? extends Number> list) {
        System.out.println("使用的泛型只能是Number/及其子类");
    }

    private static void test02_2(ArrayList<? super Number> list) {
        System.out.println("使用的泛型只能是Number/及其父类");
    }
}
