package com.itheima.joe.test.test09;

import java.util.HashMap;

/**
 * 第九题: 分析以下需求,并用代码实现
 1.定义一个储物柜类，创建储物柜对象，属性：柜子的容量；
 2.最大容量为20；为储物柜对象提供存物、取物方法；
 要求：
 (1)调用存放物品方法时，传入要存入的物品名称，判断储物柜是否有空余容量，有空余则提示存放物品成功，返回一个四位数的取货码。
 (2)调用取物方法时,传入取货码，打印出对应的物品名称，若无对应的物品则提示取货码不正确；
 */
public class Test09 {
    public static void main(String[] args)  {
        Bucket<String> bucket = new Bucket<>(new HashMap<>(),5);
        String s1 = null;
        try {
            s1 = bucket.put("数据线1");
            String s2 = bucket.put("数据线2");
            String s3 = bucket.put("数据线3");
            String s4 = bucket.put("数据线4");
            String s5 = bucket.put("数据线5");
            String s6 = bucket.put("数据线6");
        } catch (NotEnoughException e) {
            e.printStackTrace();
        }
        String goods = bucket.get(s1);
        System.out.println(goods);
    }
}
