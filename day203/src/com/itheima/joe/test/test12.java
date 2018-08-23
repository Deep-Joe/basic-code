package com.itheima.joe.test;

import java.util.HashSet;
import java.util.Random;

public class test12 {
    //十二、双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1—33中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。（要求同色号码不重复）
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        while (hashSet.size() < 6) {
            hashSet.add(random.nextInt(33) + 1);
        }
        int blue = random.nextInt(16) + 1;
        System.out.println("红球：" + hashSet);
        System.out.println("篮球：" + blue);
    }
}
