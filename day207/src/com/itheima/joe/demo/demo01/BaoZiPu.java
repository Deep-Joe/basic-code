package com.itheima.joe.demo.demo01;

public class BaoZiPu extends Thread {
    private BaoZi bz;

    public BaoZiPu(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bz) {
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0) {
                    bz.pier = "冰皮";
                    bz.xianer = "杏仁";
                } else {
                    bz.pier = "薄皮";
                    bz.xianer = "牛肉大葱";
                }
                count++;

                bz.flag = true;
                System.out.println("包子造好了: " + bz.xianer + bz.pier);
                System.out.println("吃货快来吃吧");
                bz.notify();
            }
        }
    }
}
