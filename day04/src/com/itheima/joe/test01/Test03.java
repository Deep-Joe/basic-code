package com.itheima.joe.test01;

public class Test03 {
    /*
     * 定义getChar方,法，能够将数字，根据ASCII码表，转换为对应的字符并返回，只转换大小写字母和数字字符。
     * 定义getString方法，能够将数字，根据ASCII码表，转换为对应的字符，只转换大小写字母和数字字符，并将 转换后的字符重复4次拼接成新的字符串并返回
     * */
    public static void main(String[] args) {
        int num = 97;
        char c = getChar(num);
        String s = getString(num);
        System.out.println(c);
        System.out.println(s);

    }

    /*
     * 需求分析：返回值类型: Char
     *           传入的参数类型：int
     * */
    public static char getChar(int num) {
        return (char) num;
    }

    /**
     * 需求分析： 返回值类型：String
     *          传入的参数类型 一个int类型
     */
    public static String getString(int num) {
        char c = getChar(num);
        String s = "";
        for (int i = 0; i < 4; i++) {
            s += c;
        }
        return s;
    }
}
