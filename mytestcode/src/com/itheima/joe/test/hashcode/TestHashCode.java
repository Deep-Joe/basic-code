package com.itheima.joe.test.hashcode;

import org.junit.Test;

public class TestHashCode {
    @Test
    public void testInteger() {
        //Integer类，返回的哈希码就是Integer对象里所包含的那个整数的数值
        //int，char这样的基础类，它们不需要hashCode.
        Integer i1 = 100;
        System.out.println(i1.hashCode());
        Integer i2 = 128;
        System.out.println(i2.hashCode());
        Integer i3 = 129;
        System.out.println(i3.hashCode());
    }

}
