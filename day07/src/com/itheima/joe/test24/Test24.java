package com.itheima.joe.test24;

import java.util.ArrayList;
import java.util.Random;

public class Test24 {
    /*
    第四题
	   随机生成8个1-20的数字，存放到合适的集合里面（包括1和20）
	   计算出这些随机数的平均值并且输出
	   将小于平均值的数字从集合中删除
	   使用两种方式将集合中的元素输出到控制台
     */
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            list.add(r.nextInt(20) + 1);
        }
        System.out.println("8个随机数是：" + list);
        System.out.println("平均值是：" + getAverage(list));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("大于平均值的数字的集合是：");
        int j = 0;
        ArrayList<Integer> newList = getNewArrayList(list,getAverage(list));
        System.out.println(newList);
        while (j <newList.size()) {
            System.out.print(list.get(j) + " ");
            j ++;
        }

    }

    public static double getAverage(ArrayList<Integer> list) {
        double average = 1.0;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        average = sum / list.size();
        return average;
    }

    public static ArrayList<Integer> getNewArrayList(ArrayList<Integer> list, double average) {
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) < average) {
                list.remove(i);
                i--;// 当remove掉是 集合元素指标自动向前调整，所以'i--' 抵消掉for循环中的'i++'
            }
        }
        return list;
    }
}
