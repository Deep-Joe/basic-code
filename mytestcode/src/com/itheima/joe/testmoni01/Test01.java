package com.itheima.joe.testmoni01;

import java.util.Arrays;

public class Test01 {
    /*
    1.  (1)定义一个方法
		public Object[] deleteSubString(String str1,String str2) {}
    (2)方法功能描述:从str1中删除所有的str2,并返回删除后的结果,返回结果为Object[]数组
	* 该数组的第一个元素删除所有的str2后的最终的字符串
	* 该数组的第二个元素为删除的str2的个数
     */
    public static void main(String[] args) {
        String s1 = "javajavaheima ni hao ";
        String s2 = "java";
        System.out.println(Arrays.toString(deleteSubString(s1,s2)));
    }

    public static Object[] deleteSubString(String str1, String str2) {
        String replace = str1.replace(str2, "");
        int count = (str1.length() -replace.length()) / str2.length();
        Object[] objects = {replace, count};
        return objects;
    }
}
