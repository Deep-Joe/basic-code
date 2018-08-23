package com.itheima.joe.test;

import java.util.ArrayList;
import java.util.Random;

//十、产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
public class Test10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ints = new int[10];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
           int e = random.nextInt(100) + 1;
           ints[i] = e;
           if (ints[i] >= 10) {
               list.add(e);
           }
        }
        System.out.println(list);
    }
}
