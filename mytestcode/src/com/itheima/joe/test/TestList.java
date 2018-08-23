package com.itheima.joe.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class TestList {
    @Test
    public void testList_set() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc01");
        list.add("abc02");
        list.add("abc03");
        // public E set(int index,E e);
        //该方法是替换掉指定索引下的元素，返回的是被替换的元素。
        String s = list.set(1, "abc002");
        //abc02
        System.out.println(s);
        //[abc01, abc002, abc03]
        System.out.println(list);
    }

    @Test
    public void testLinkedList() {
        //LinkedList的是数据存储结构是一个双向链表
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("abc01");
        linkedList.add("abc02");
        linkedList.add("abc03");
        linkedList.add("abc04");
        linkedList.add("abc05");
        for (int i = 0; i < linkedList.size(); i++) {
            String s = linkedList.get(i);
            System.out.println(s);
        }
    }

    @Test
    public void testLinkHashSet() {
        //看下LinkHashSet类的源码
//      public class LinkedHashSet<E>
//      extends HashSet<E>
//      implements Set<E>, Cloneable, java.io.Serializable
    }
}
