package com.itheima.joe.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestDemo {
    @Test
    public void test01() {
        Collection<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张翠山");
        list.add("赵敏");
//        list.add("赵敏");
//        Iterable
        for (String s : list) {
            if (s.equals("张翠山")) {
                list.remove(s);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void hashSetTest() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("abc01");
        hashSet.add("abc02");
        hashSet.add("abc03");
        for (String s : hashSet) {
            System.out.println(s);
        }
        System.out.println(hashSet);
    }
}
