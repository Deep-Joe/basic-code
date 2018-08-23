package com.itheima.joe.test.test_iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class TestIterator {
    @Test
    public void test01() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc01");
        list.add("abc02");
        list.add("abc03");
        list.add("abc04");
        list.add("abc05");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if ("abc01".equals(s)) {
                //调用iterator迭代器的remove()方法，不会报错
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    @Test
    public void test02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc01");
        list.add("abc02");
        list.add("abc03");
        list.add("abc04");
        list.add("abc05");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if ("abc02".equals(s)) {
                //listIterator继承了Iterator并且实现了ListIterator
                //所以有add(),remove(),set()方法等。
                iterator.add("add002");
            }
        }
        System.out.println(list);
    }

    @Test
    public void test03() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc01");
        list.add("abc02");
        list.add("abc03");
        list.add("abc04");
        list.add("abc05");
        for (String s : list) {
            //ConcurrentModificationException 增强for循环内部原理就是iterator迭代器，所以在循环内部不能对list作为对象操作。
            if ("abc05".equals(s)) {
                list.add("abc005");
            }
        }
    }

    @Test
    public void test04() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc01");
        list.add("abc02");
        list.add("abc03");
        list.add("abc04");
        list.add("abc05");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if ("abc04".equals(s)) {
//                java.util.ConcurrentModificationException
                list.add("abc044");
            }
        }
    }

    @Test
    public void test05() {
//        java.lang.ClassCastException
//        由于集合中什么类型的元素都可以存储。导致取出时强转引发运行时 ClassCastException。
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add("itcast");
//      由于集合没有做任何限定，任何类型都可以给其中存放
        coll.add(5);
        Iterator it = coll.iterator();
        while (it.hasNext()) {
            //需要打印每个字符串的长度,就要把迭代出来的对象转成String类型
            String str = (String) it.next();
            System.out.println(str.length());
        }
    }
}