package com.itheima.joe.demo01;

import java.util.Random;
import java.util.Scanner;

public class Demo02Random {
    /**
     * 游戏开始时，会随机生成一个1-100之间的整数 number 。
     * 玩家猜测一个数字 guessNumber ，会与 number 作比 较，系统提示大了或者小了，直到玩家猜中，游戏结束。
     */
    public static void main(String[] args) {
        //系统随机生成一个1~100之间的整数 number
        Random r = new Random();//随机数生成器
        int number = r.nextInt(100) + 1;//用debug 可以看到随机数
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数字");
            int guess = in.nextInt();
            if (guess == number) {
                System.out.println("恭喜您！随机数是：" +number +"与您输入的值相同。");
                break;
            } else if (guess < number) {
                System.out.println("很抱歉~您输入的：" + guess + "小了。");
            } else {
                System.out.println("很抱歉~您输入的：" + guess + "大了。");
            }
        }

    }
}
