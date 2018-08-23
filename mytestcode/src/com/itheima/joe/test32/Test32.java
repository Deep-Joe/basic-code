package com.itheima.joe.test32;

import java.util.ArrayList;

public class Test32 {
    /*
    二、【代码题】
定义一个无返回值，参数为String[] 数组的方法，实现以下功能：
1)  把数组中的元素存入到一个ArrayList集合中，删除集合中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)。
2)  遍历该集合打印剩余元素。

在main方法中，定义一个字符串数组String arr[]={“0af3s2sf”,”s6ds1”,”jjww”,”lailai”}，并将这个字符串数组传入上述方法中，进行测试。

     */
    public static void main(String[] args) {
        String[] arr ={"0af3s2sf" , "s6ds1","jjww","lailai"};
        method(arr);
    }

    public static void method(String[] strings) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i]);
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            String s = list.get(i);
            for (int j = 0 ; j < s.length(); j++) {
                if (s.charAt(j) >= '0' && s.charAt(j) <='9') {
                    list.remove(i);
                    break;
                }
            }
        }
        System.out.println("删除有数字的字符串之后的集合有：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
