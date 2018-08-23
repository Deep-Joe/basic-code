package com.itheima.joe.test.node;

import java.util.LinkedList;
import java.util.TreeMap;

public class NodeDemo {
    public static void main(String[] args) {
     /*   LinkedList<Integer> linkedList = new LinkedList<>();
        Node first = new Node();
        Node sceond = new Node(first, 1, new Node(second, 2, null));
        System.out.println(first);
        System.out.println(sceond);*/
        Node<Integer> first = new Node<>(null,0,null);
        Node<Integer> second = new Node<>(null,1,null);
        Node<Integer> third = new Node<>(null,2,null);
        first.setNext(second);
        second.setPre(first);
        second.setNext(third);
        third.setPre(second);
        System.out.println(second.next.item);

    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPre() {
            return pre;
        }

        public void setPre(Node<E> pre) {
            this.pre = pre;
        }

        Node<E> pre;

        Node() {};
        Node(Node<E> pre, E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.pre = pre;
        }
    }
}
