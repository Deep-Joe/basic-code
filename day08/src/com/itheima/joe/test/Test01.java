package com.itheima.joe.test;

import java.util.Scanner;

public class Test01 {
    /*
    第二题：分析以下需求，并用代码实现
	1.键盘录入一个大字符串,再录入一个小字符串
	2.统计小字符串在大字符串中出现的次数
	3.代码运行打印格式:
		请输入大字符串:woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
		请输入小字符串:heima
		控制台输出:共出现3次
	分析：遍历大字符串 当碰到小字符串的第一个字符串相等时 i++;
	        遇到不同时 j == 0;从新开始
	        当j == chS.length-1时 count++;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大字符串：");
        String str = sc.next();
        System.out.println("请输入一个小字符串：");
        String s = sc.next();
        int count = 0; //计数器
     /*   char[] chStr = str.toCharArray();
        char[] chS = s.toCharArray();
        int i = 0;//大字符串的角标
        int j = 0;//小字符串的角标
        while (i < chStr.length) {

            if (chStr[i] == chS[j]) {
                j++;
                if (j == chS.length - 1) { //当该条件满足是说明找到了一个匹配的小字符串，计数器+1，并且让小字符串的角标为0
                    count++;
                    j = 0;
                }
            } else {// 不相等时 小字符串从0重新开始遍历
                j = 0;
            }
            i++;
        }*/
        String replaceStr = str.replace(s, "");
        count = (str.length() - replaceStr.length()) / s.length();
        System.out.println(count);
      /* for (int i = 0; i < chStr.length; i++) {
           for (int j = 0; j < chS.length; j++) {
               if (chStr[i] == chS[j] && j == chS.length-1) {
                   count++;
               }
           }
       }*/
        System.out.println(count);
    }
}
