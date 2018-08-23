package com.itheima.joe.test01;

public class Test22 {
    /**
     * 需求：有一只兔子，从出生后第3个月起每个月都生只兔子，
     * 小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，用代码实现求第12个月的兔子总数为多少？
     */
    public static void main(String[] args) {
        int sum = getSum(12);
        System.out.println(sum);
    }

    public static int getSum(int mounth) {
        if (mounth ==1 || mounth == 2) {
           return 1;
        } else {
            return getSum(mounth -1) +getSum(mounth -2);
        }
    }
}
