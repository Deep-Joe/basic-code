package com.itheima.joe.test.test11;


import java.util.Arrays;

//十一、编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
public class Test11 {
    public static void main(String[] args) {
        String[] strings = {"abc", "abc1", "abc2", "abc3", "abc4"};
        String[] method = GenericDemo.method(strings, 1, 2);//调用方法时正常格式
        System.out.println(Arrays.toString(method));
        GenericDemo.reverse(strings);
    }
}
