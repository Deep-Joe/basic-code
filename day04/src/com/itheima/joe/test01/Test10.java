package com.itheima.joe.test01;

public class Test10 {
    /**
     * 复利的力量：也就是『利滚利』。每年购买1万元理财产品，收益率为10%，输入年数，返回未来资产总值
     */
    public static void main(String[] args) {
        //每年本金10000
        int a = 10000;
        //利率
        double rate = 0.1;
        for (int year = 1; year <= 20; year++) {
            System.out.println("第" + year + "年末" + function(a, rate, year));
        }
    }

    public static int function(int every, double rate, int year) {
        double r = 1;
        //计算利率
        for (int i = 0; i < year; i++) {
            r *= (1 + rate);
        }
        /**
         * 年末本金 = 每年购买金额 * ( (1 + 利率) ^n -1 ) / 利率
         */
        double f = every * (r - 1) / rate;
        return (int) f;
    }
}
