package com.itheima.joe.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test02 {
    /*
    第三题：分析以下需求,并用代码实现
		定义String getStr()方法
		功能描述：
			获取长度为5的随机字符串
			字符串由随机的4个大写英文字母和1个0-9之间(包含0和9)的整数组成
			英文字母和数字的顺序是随机的
     */
    public static void main(String[] args) {
        String s = getString02();
        System.out.println(s);
        System.out.println((int)('0')); //'0' ~'9' 48~58
    }

    /*
    返回类型 String
    参数 空
    分析
     */
    public static String getString() {
        Random r = new Random();
        String s = "";
        for (int i = 0; i < 4; i++) {
            s += (char)(r.nextInt('Z' - 'A' +1) + 'A');
        }
        char[] chars = new char[5];
        chars[r.nextInt(5)] =(char)(r.nextInt(10) + '0');
        int j = 0; //新空字符数组的角标
        int i = 0;
        while (j < chars.length ) {
            if (chars[j] >= '0' && chars[j] <= '9') {
                j++;
                continue;
            } else {
                chars[j] = s.charAt(i);
                i++;
            }
            j++;
        }
       return Arrays.toString(chars);

    }

    public static String getString02() {
        Random r = new Random();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add((char) (r.nextInt('Z' - 'A' + 1) + 'A'));
        }
        char charNum = (char) (r.nextInt(10) + '0');
        int randomIndex = r.nextInt(5);
        String s = "";
        int listIndex = 0;
        for (int i = 0; i < 5; i++) {
            if (i == randomIndex) {
                s += charNum;
            } else {
                s += list.get(listIndex);
                listIndex++;
            }
        }
        return s;
    }
}
