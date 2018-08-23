package com.itheima.joe.test.test11;

import java.util.ArrayList;
import java.util.Collections;

//十一、编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
//十二、编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
public class GenericDemo {
    public static <T> T[] method(T[] arr, int srcIndex, int desIndex) {
        T temp = arr[srcIndex];
        arr[srcIndex] = arr[desIndex];
        arr[desIndex] = temp;
        return arr;
    }

    public static <E> void reverse(E[] arr) {
        ArrayList<E> list = new ArrayList<>();
        for (E e : arr) {
            list.add(e);
        }
        Collections.reverse(list);
        System.out.println(list);
    }

}
