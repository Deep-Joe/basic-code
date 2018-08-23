package com.itheima.joe.test;

public class Test21 {
    /*
            一
        有如下字符串:"12ab","java","cd","Server78"
        遍历这些字符串，如果字符串没有包含数字的，就将字符串中的小写字母转成大写字母并打印字符串
        分析：
            1.把字符串数组遍历
            2.把每个字符串转换成字符数组
            3.判断每个字符是否在'0' ~'9'中
                如果在结束循环，遍历下一个字符串
                如果不在则j++, 当j== chs.length -1时 把这个字符串转换成大写
     */
    public static void main(String[] args) {
        String[] strs = {"12ab", "java", "cd", "Server78"};
        String s = "";
        for (int i = 0; i < strs.length; i++) {
            s = strs[i];
            char[] chs = s.toCharArray();
            for (int j = 0; j < chs.length; j++) {
                if ('0' <= chs[j] && chs[j] <= '9') {
                    break;
                } else {
                    if (j == chs.length - 1) {
                        System.out.println(strs[i].toUpperCase());
                    }
                }
            }
        }
    }
}
