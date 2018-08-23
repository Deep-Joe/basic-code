package com.itheima.joe.test;

import java.util.ArrayList;

public class Test24 {
    /*
    四
根据要求完成以下功能：
a.定义ArrayList集合，存入如下字符串：
"ab1"，"123ad"， "dadfadf"，"dddaaa"， "我来啦" ，"你别跑啊"
b.遍历集合,删除长度大于4的元素,在控制台打印输出删除后的集合中所有元素
输出结果格式如下：
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ab1");
        arrayList.add("123ad");
        arrayList.add("dadfadf");
        arrayList.add("dddaaa");
        arrayList.add("我来啦");
        arrayList.add("你别跑啊");
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() > 4) {
                arrayList.remove(i);
                i--;
            }
        }
        System.out.println(arrayList);
    }
}
