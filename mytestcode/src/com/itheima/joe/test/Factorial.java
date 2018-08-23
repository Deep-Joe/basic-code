package com.itheima.joe.test;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(mul100(100));
    }

    public static String mul100(int count) {
        BigInteger result = new BigInteger(String.valueOf(1));
       for (int i = 1; i <= count; i++) {
           BigInteger i_value = new BigInteger(String.valueOf(i));
           result = result.multiply(i_value);
       }
       return result.toString();
    }
}
