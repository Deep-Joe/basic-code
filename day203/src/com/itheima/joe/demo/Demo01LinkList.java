package com.itheima.joe.demo;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo01LinkList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("abc01");
        linkedList.add("abc02");
        linkedList.add("abc03");
        linkedList.add("abc04");
        linkedList.add("abc05");
//        System.out.println(linkedList);
        linkedList.addFirst("ABC06");
//        System.out.println(linkedList);
        linkedList.push("ABC07");
//        System.out.println(linkedList);
        linkedList.addLast("ABC08");
//        System.out.println(linkedList);
        String pop = linkedList.pop(); //检索但删除此列表的头
//        System.out.println(pop);
        String first = linkedList.getFirst();
//        System.out.println(first);
//        System.out.println(linkedList);
        linkedList.set(1,"ABC09");//在指定下标位置替换掉元素
//        System.out.println(linkedList);
        String peek = linkedList.peek();//检索但不删除次列表的头
//        System.out.println(peek);
//        System.out.println(linkedList);
        ListIterator<String> stringListIterator = linkedList.listIterator();
//        while (stringListIterator.hasNext()) {
//            String next = stringListIterator.next();
//            System.out.println(next);
//        }
    }
}
