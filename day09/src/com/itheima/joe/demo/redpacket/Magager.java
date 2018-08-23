package com.itheima.joe.demo.redpacket;

import java.util.ArrayList;

public class Magager extends User {
    public Magager(String name, int money) {
        super(name, money);
    }

    public Magager() {
    }

    /*
    群主具有发红包的功能
    返回值类型：ArrayList<Integer> 红包集合
    参数列表：int totalMoney ;要发红包的金额
            int count; 拆成几个红包
     */
    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> list = new ArrayList<>();
        //判断要发的金额是否大于余额，如果小于金额 则返回空的list集合

        if (totalMoney > this.getMoney()) {
            return list;
        }
        //每次红包的金额是ave = totalMoney / count
        //如果有余数 那么最后一次的红包是 totalMoney % count + ave;
        int ave = totalMoney / count;
        for (int i = 0; i < count - 1; i++) {
            list.add(ave);
        }
        list.add(totalMoney % count +ave);
        return list;
    }
}
