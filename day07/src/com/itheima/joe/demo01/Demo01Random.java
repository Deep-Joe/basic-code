package com.itheima.joe.demo01;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        for ( int i = 0; i < 100; i++ ) {
            int number = r.nextInt(11)-2;
            System.out.println(number);
        }
    }
}
