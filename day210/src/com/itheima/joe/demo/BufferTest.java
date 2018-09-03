package com.itheima.joe.demo;

import java.io.*;
import java.util.HashMap;

public class BufferTest {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> hashMap = new HashMap<>();
        BufferedReader bfr = new BufferedReader(new FileReader("b.txt"));
        BufferedWriter bfw = new BufferedWriter(new FileWriter("copy_b.txt"));
        String s ;
        while ((s = bfr.readLine()) != null) {
            String[] split = s.split("\\.");
            hashMap.put(split[0],split[1]);
        }
        bfr.close();

        for (int i = 1; i <= hashMap.size(); i++) {
            String key = String.valueOf(i);
            String value = hashMap.get(key);
            bfw.write(key + "." + value);
            bfw.newLine();
        }
        bfw.close();
    }
}
