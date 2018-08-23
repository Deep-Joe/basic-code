package com.itheima.joe.test.generic;

import org.junit.Test;

public class TestDemo {
    @Test
    public void test01() {
        GenericTest<String> genericTest = new GenericTest<>();
        genericTest.show1(3);
        genericTest.show1("abc");
    }

    @Test
    public void testImp1() {
        MyImp1 myImp1 = new MyImp1();
        myImp1.add("abc1");
    }

    @Test
    public void testImp2() {
        MyImp2<String> myImp2 = new MyImp2<>();
        myImp2.add("abc2 ");
    }

}
