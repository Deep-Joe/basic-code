package com.itheima.joe.test.threadtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LotteryPool implements Runnable{
//    private ArrayList<String> list = new ArrayList<>(List.of("魅族E","畅玩6X","坚果Pro","小米Note2","iphone 7Plus","一加手机 5","三星 Galaxy S6","华为p10 Plus","OPPO A77","华为荣耀 V9","努比亚 Z17","Moto Z Play"))
    private ArrayList<String> list = new ArrayList<>(Arrays.asList("魅族E", "畅玩6X", "坚果Pro", "小米Note2", "iphone 7Plus", "一加手机 5", "三星 Galaxy S6", "华为p10 Plus", "OPPO A77", "华为荣耀 V9", "努比亚 Z17", "Moto Z Play"));
    private int i;
    @Override
    public void run() {
        ArrayList listThread = new ArrayList();
        synchronized (this) {
            Thread.currentThread().setName("将箱" + ++i);
        }
        while (true) {
            synchronized (this) {
                if (list.size() == 0 || null == list) {
                    if (listThread.size() > 0) {
                        System.out.println("在此次抽奖过程中，"+ Thread.currentThread().getName() + "总共产生了"+ listThread.size() +"个奖项，分别为：" + listThread);
                    } else {
                        System.out.println("在此次抽奖过程中"+Thread.currentThread().getName()+"没有抽到奖项，下次努力~");
                    }
                    break;
                }
                int i = new Random().nextInt(list.size());
                String remove = list.remove(i);
                listThread.add(remove);
            }
        }
    }
}