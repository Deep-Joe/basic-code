package com.itheima.joe.test01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test01 {
    /**
     * 1.定义一个List<String>集合，元素有：{“张小元”,“李小宁”,”王小伟”,”赵小辉”,”王小生”,”张小苗”}模拟小朋友分组做游戏，集合中的六个元素（字符串）代表6个小朋友
     a.  利用随机数将这6个人随机分成两组，每组3人；
     b.  将分好的两组组员名分别输出到控制台上；
     评分细则：
     1、	随机数生成正确（随机范围，个数）4分（各占2分）
     2、	提示用户输入 2分
     3、	无限键盘录入(无限循环,键盘录入) 4分（各占2分）
     4、	判断比随机数大输出3分(其中判断2分,输出1分)
     5、	判断比随机数小输出3分(其中判断2分,输出1分)
     6、	判断一致输出结果退出循环4分（其中退出循环占2分，判断1分，输出1分）
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入6个小朋友的名字：");
        for (int i = 0; i < 6; i++) {
            String s = sc.next();
            arrayList.add(s);
        }
        ArrayList<String> list01 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list01.add(arrayList.remove(r.nextInt(6)));
        }
        System.out.println("第一组：");
        System.out.println(list01);
        System.out.println("第二组：");
        System.out.println(arrayList);


    }
}
