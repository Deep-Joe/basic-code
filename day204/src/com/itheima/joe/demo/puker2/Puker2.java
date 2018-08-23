package com.itheima.joe.demo.puker2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 扑克的升级
 * 步骤分析：
 *  1.准备牌
 *      1.1准备花色的容器
 *      1.2准备牌数字的容器
 *      1.3准备存储牌索引的容器
*       1.4将牌的索引做为key值，将牌作为value值存入HashMap中
*   2.发牌
 *      2.1将索引的容器打乱
 *      2.2根据条件将索引值分发到四个容器中
 *  3.看牌
 *      3.1根据各自容器的索引值，获得对应的值
 */
public class Puker2 {
    public static void main(String[] args) {
        List<String> list01 = List.of("♤", "♥", "♢", "♣");
        List<String> list02 = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        List<Integer> index_list = new ArrayList<>();
        HashMap<Integer,String> puker = new HashMap<>();
        List<Integer> play01 = new ArrayList<>();
        List<Integer> play02 = new ArrayList<>();
        List<Integer> play03 = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();
        int index = 0;
        puker.put(index,"大王");
        index_list.add(index);
        index++;
        puker.put(index, "小王");
        index_list.add(index);
        index++;
        for (int i = 0; i < list02.size(); i++) {
            for (int j = 0; j < list01.size(); j++) {
                String s = list02.get(i) + list01.get(j);
                puker.put(index,s);
                index_list.add(index);
                index++;
            }
        }
//        System.out.println(puker);
        Collections.shuffle(index_list);
        for (int i = 0; i < index_list.size(); i++) {
            if (i > index_list.size()-4) {
                dipai.add(index_list.get(i));
            } else if ( i % 3 == 0 ) {
                play01.add(index_list.get(i));
            } else if ( i % 3 == 1 ) {
                play02.add(index_list.get(i));
            } else if ( i % 3 == 2 ) {
                play03.add(index_list.get(i));
            }
        }
        getPai(puker,play01,"周星驰");
        getPai(puker,play02,"周润发");
        getPai(puker,play03,"刘德华");
        getPai(puker,dipai,"底牌");
    }

    private static void getPai(HashMap<Integer,String> puker, List<Integer> player, String name) {
        Collections.sort(player);
        System.out.print(name + ": ");
        for (Integer index : player) {
            String s = puker.get(index);
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
