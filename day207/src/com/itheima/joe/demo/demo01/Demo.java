package com.itheima.joe.demo.demo01;

public class Demo {
    public static void main(String[] args) {
        BaoZi baozi = new BaoZi();
        BaoZiPu baoZiPu = new BaoZiPu("包子铺",baozi);
        ChiHuo chiHuo = new ChiHuo("吃货", baozi);
        baoZiPu.start();
        chiHuo.start();
    }
}
