package com.itheima.joe.test;

import java.util.ArrayList;

public class Test03 {
    /**
     * 第四题：分析以下需求并实现
     1.创建一个ArrayList集合，用于存储一些字符串："abc","def","def","ghi","def","hij","jkol"
     2.遍历集合，统计集合中"def"字符串一共出现了多少个
     3.将集合中的所有"def"字符串删除。打印删除后的集合元素
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        int count = 0;
        arrayList.add("abc");
        arrayList.add("def");
        arrayList.add("def");
        arrayList.add("ghi");
        arrayList.add("def");
        arrayList.add("hij");
        arrayList.add("jkol");
        System.out.println(arrayList);
        String s = "";
      /*  for (int i = 0; i < arrayList.size(); i++) {
            s = arrayList.get(i);
            if (s == "def") {//这里不是打印arrayList[i];
                count++; //出现的个数
                arrayList.remove(i);//移除之后后面的元素角标自动减1
                i--;
            }
            //  System.out.println(arrayList.get(i));
        }*/
      for (int i = arrayList.size()-1; i >= 0; i--) {
          s = arrayList.get(i);
          if (s == "def") {
              count++;
              arrayList.remove(i);//
          }
      }
        System.out.println("一共出现：" + count);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
