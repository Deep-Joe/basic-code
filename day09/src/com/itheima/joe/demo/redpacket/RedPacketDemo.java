package com.itheima.joe.demo.redpacket;

import java.util.ArrayList;

public class RedPacketDemo {
    public static void main(String[] args) {
        Magager magager = new Magager("群主",100);
        Member member01 = new Member("成员A",0);
        Member member02 = new Member("成员B",0);
        Member member03 = new Member("成员C",0);
        Member member04 = new Member("成员D",0);
        Member member05 = new Member("成员E",0);
        ArrayList<Integer> list = magager.send(50,5);
        member01.openRedPacket(list);
        member02.openRedPacket(list);
        member03.openRedPacket(list);
        member04.openRedPacket(list);
        member05.openRedPacket(list);
        magager.show();
        member01.show();
        member02.show();
        member03.show();
        member04.show();
        member05.show();
    }
}