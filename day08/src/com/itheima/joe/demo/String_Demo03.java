package com.itheima.joe.demo;

public class String_Demo03 {
    public static void main(String[] args) {
        //创建字符串对象
        String s = "abcde";

        //char[] toCharArray():把字符串转换成字符数组
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        System.out.println("-----------");

        //byte[] getBytes():把字符串转换为字节数组
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("---------");

        //替换字母it为大写IT
        String str = "itcast itheima";
        String replace = str.replace("it","IT");
        System.out.println("-----------");

        String string = "aa|bb|cc";
        String[] strArray = s.split("|");//{"aa","bb","cc"}
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }

}
