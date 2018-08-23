package com.itheima.joe.demo02;

import java.util.ArrayList;
import java.util.Random;

public class Test01ArrayList {
    /**
     * 生成6个1~33之间的随机整数,添加到集合,并遍历
     */
    public static void main(String[] args) {
        //随机数生成器
        Random r = new Random();

        //生成ArrayList集合容器
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int number = r.nextInt(33) +1;
            arrayList.add(number);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
