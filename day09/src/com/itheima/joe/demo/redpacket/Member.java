package com.itheima.joe.demo.redpacket;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(String name, int money) {
        super(name, money);
    }

    public Member() {
    }

    /*
    普通成员具有收红包的功能
    方法 openRedPacket
    返回类型 无
    参数类型 红包集合
     */
    public void openRedPacket(ArrayList<Integer> list) {
        /*
        从红包集合中随机拿到个红包后，增加到余额中 然后从红包集合中移除
         */
        Random r = new Random();
        int index = r.nextInt(list.size());
        int redMoney = list.remove(index);
        this.setMoney(this.getMoney() + redMoney);
    }
}
