package com.itheima.joe.test.collection;

import org.junit.Test;
import sun.misc.Unsafe;

import java.util.*;

public class DemoTest {
    @Test
    public void testIterator() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        list.add("abc4");
        for (Iterator it = list.iterator();it.hasNext();) {//节省内存空间
            System.out.println(it.next());
        }

    }

    @Test
    public void test02() {
        Integer i = 4;
    }

    @Test
    //试验：stringBuilder.append(e == this ? "this Collectioin" : e);
    //目的 体现了Java语言的健壮性
    public void test03() {
        ArrayList<ArrayList> arrayLists = new ArrayList<>();
        arrayLists.add(arrayLists);
        System.out.println(arrayLists);
    }

    @Test
    //public interface Iterable<T>实现这个接口允许对象成为 "foreach" 语句的目标。
    //遍历的对象是数组或集合；遍历的时候不能做添加的操作
    public void test04() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        list.add("abc4");
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    //实验：Map集合的遍历
    public void test05() {
        HashMap<String,String> maps = new HashMap<>();
        maps.put("key1","value1");
        maps.put("key2","value2");
        maps.put("key3","value3");
        maps.put("key4","value4");
        Collection<String> values = maps.values();
        Set<String> strings = maps.keySet();
        for (String string : strings) {
//            System.out.println(string);
            String s = maps.get(string);
            System.out.println(s);
        }
        for (String value : values) {
            System.out.println(value);
        }
    }

    @Test
    public void test06() {
        String s = "abc";
        String s1 = "ab";
        String s3 = s1 + "c";
        System.out.println(s3.intern()==s.intern());
    }
}
