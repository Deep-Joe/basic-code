package com.itheima.joe.demo.puker;

import java.util.ArrayList;
import java.util.Collections;

/*
斗地主小程序
    装牌
        四种花色
        A~K
        大小王
    洗牌
        用到Collections工具类中
        static void shuffle(List<?> list)
            使用默认随机源对指定列表进行置换。
    发牌
        玩家1、玩家2、玩家3、底牌三张
    看牌
 */
public class PukerDemo {
    public static void main(String[] args) {
        //创建扑克的容器
        ArrayList<String> puker = new ArrayList<>();
        puker.add("大王");
        puker.add("小王");

        //创建两个数组分别装花色，数字；
        String[] colors = {"♤", "♡", "♢", "♣"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        //将两字符串数组进行拼接，然后存到puker中
        for (String color : colors) {
            for (String number : numbers) {
                puker.add(color + number);
            }
        }
//        System.out.println(puker);

        /*
        洗牌
            static shuffle(List<?> list>
         */
        Collections.shuffle(puker);
//        System.out.println(puker);

        /*
        发牌：创建四个容器分别为玩家1、玩家2、玩家3、底牌
            根据条件判定发到四个容器中
         */
        //创建四个容器
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < puker.size(); i++) {
            String number = puker.get(i);
            if (i < 3 ) {
                dipai.add(number);
            } else if (i % 3 == 0) {
                player01.add(number);
            } else if (i % 3 == 1) {
                player02.add(number);
            } else if (i % 3 == 2 ) {
                player03.add(number);
            }
        }

        /*
        看牌
         */
        System.out.println("小赵" + player01);
        System.out.println("小钱" + player02);
        System.out.println("小孙" + player03);
        System.out.println("底牌" + dipai);
    }
}
