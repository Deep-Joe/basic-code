package com.itheima.joe.test.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    @Test
    public void test01() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"abc01");
        map.put(2,"abc02");
        map.put(3,"abc03");
        map.put(4,"abc04");
        map.put(5,"abc05");
        //打印{1=abc01, 2=abc02, 3=abc03, 4=abc04, 5=abc05}
        System.out.println(map);
    }

    @Test
    public void test02() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"abc01");
        map.put(2,"abc02");
        map.put(3,"abc03");
        map.put(4,"abc04");
        map.put(5,"abc05");
    }

    @Test
    /**
     *map集合的第一种遍历方式：Set keySet()
     */
    public void test03() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"abc01");
        map.put(2,"abc02");
        map.put(3,"abc03");
        map.put(4,"abc04");
        map.put(5,"abc05");
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            String s = map.get(next);
            System.out.println(next + "....." + s);
        }
        System.out.println("==========");
        for (Integer integer : set) {
            String s = map.get(integer);
            System.out.println(integer + "....." + s);
        }
    }

    @Test
    /**
     * map集合的第二种遍历方式：Set entrySet(); 再通过遍历Set获得entry
     *                          K entry.getKey();
     *                          V entry.getValue();
     */
    public void test04() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"abc01");
        map.put(2,"abc02");
        map.put(3,"abc03");
        map.put(4,"abc04");
        map.put(5,"abc05");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "========" + value);
        }
        System.out.println("=================");
        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "========" + value);
        }
    }
}
