package com.itheima.joe.demo;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo03BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("buffered.txt"));
        String s = bfr.readLine();
        System.out.println(s);
    }
}
