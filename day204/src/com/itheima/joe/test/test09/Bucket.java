package com.itheima.joe.test.test09;

import java.util.HashMap;
import java.util.Random;

/**
 * 第九题: 分析以下需求,并用代码实现
 * 1.定义一个储物柜类，创建储物柜对象，属性：柜子的容量；
 * 2.最大容量为20；为储物柜对象提供存物、取物方法；
 * 要求：
 * (1)调用存放物品方法时，传入要存入的物品名称，判断储物柜是否有空余容量，有空余则提示存放物品成功，返回一个四位数的取货码。
 * (2)调用取物方法时,传入取货码，打印出对应的物品名称，若无对应的物品则提示取货码不正确；
 */
public class Bucket<E> {
    private int size;
    private final int MAX_SIZE = 20;
    private HashMap<String, E> hashMap;

    public Bucket() {
    }

    public Bucket(HashMap<String, E> hashMap, int size) {
        this.hashMap = hashMap;
        this.size = size;
    }

    public HashMap<String, E> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, E> hashMap) {
        this.hashMap = hashMap;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String put(E e) {
        String s = "";
        if (size <= MAX_SIZE) {
            size++;
            Random random = new Random();
            for (int i = 0; i < 4; i++) {
                s += random.nextInt(10);
            }
            hashMap.put(s, e);
        } else {
            System.out.println("bucket容量已满，存不下了");
        }
        return s;
    }

    public E get(String s) {
        if (hashMap.containsKey(s)) {
            return hashMap.get(s);
        } else {
            System.out.println("您的输入的取货码错误，请重新输入！");
            return null;
        }
    }
}
