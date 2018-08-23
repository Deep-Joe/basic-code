package com.itheima.joe.test22;

import java.util.Random;
import java.util.Scanner;

public class Test22 {
    /**
     * 2.【代码题】
     定义方法 found(String str)，要求如下:
     形参: String str
     返回值类型 int
     实现:从str中随机获取一个字符，将该字符打印在控制台，并且统计该字符在str中出现的次数
     在main方法中完成以下要求，从控制台键盘录入一个字符串,调用found(String str)方法，在控制台输出返回的次数
     */
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = found(str);
        System.out.println("随机字符出现的次数是：" + count);
    }
    public static int found(String  str) {
       char[] strArr = str.toCharArray();
       int count = 0;
        Random r = new Random();
        int num = r.nextInt(strArr.length);//[0,strArr.length]
        char c = strArr[num];
        System.out.println("随机数是：" + c);
        for (int i = 0; i < strArr.length; i++) {
            if (c == strArr[i]) {
                count++;
            }
        }
        return count;
    }
}
