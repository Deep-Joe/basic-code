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
                   bz.pier = "冰皮虾仁";
                   bz.xianer = "鲜肉";
               } else {
                   bz.pier = "菲菜大葱";
                   bz.xianer = "牛肉";
               }
               count++;
               System.out.println("包子造好了 " + bz.pier + bz.xianer);
               System.out.println("吃货们快过来吃吧！");
               bz.flag = true;
               bz.notify();
           }
       }
    }
}
