package com.itheima.joe.test.finallytest;

public class Demo01Finally {
    public static void main(String[] args) {
//        System.out.println(test());
        System.out.println(test02());
    }

    private static int test() {
        int i = 0;
        try{
            return ++i;
        }finally {
            return 5;
        }
    }
    private static int test02() {
        int i = 0;
        try {
            return ++i;
        } finally {
//            i = 3;
            System.out.println("执行到了finnaly语句");

        }
    }
}
