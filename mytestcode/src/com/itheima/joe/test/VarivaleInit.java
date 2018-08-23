package com.itheima.joe.test;

public class VarivaleInit {
    static String string;
    static int num;
    static double d;
    static boolean b;
    static int[] arr ;
    static char c;
    public static void main(String[] args) {
//        String s ;
//        System.out.println(s); 报错：局部字符串变量得赋初始值

//        String s = new String();
//        System.out.println(s);
/*
          public String() {
             this.value = "".value;
             this.coder = "".coder;
        }
        调用的空构造方法让成员变量初始化值
        */

//        int[] arr;
//        System.out.println(arr); 报错：局部变量只有声明，没有默认的值

//        int[] arr = new int[5];  这个不仅仅只有声明，并把 new 出来数组对象的地址赋值给arr;
//        System.out.println(arr[0]); 整数数组中的元素默认为0

//        String[] strings = new String[5];
//        System.out.println(strings[0]);  //字符串数组元素默认为

//        char[] chars = new char[5];
//        System.out.println(chars);    //字符数组比较特殊 输出的不是地址值，而是数组中的内容，原因 有道云笔记里面有

//        System.out.println(string); //成员引用类型（字符串）变量 默认为null;

//        System.out.println(num); //成员整数变量 默认为0;

//        System.out.println(d); //成员double变量 默认为 0.0；

//        System.out.println(b); //成员boolean变量 默认为 false；

//        System.out.println(arr); //成员变量为引用类型的 默认都为 null

//        System.out.println(c);  //成员变量char变量 默认为 /uxxxx;

//        总结：局部变量没有默认值，只有成员变量有默认值 凡是引用类型都为null,基本数据类型：整形 0；浮点类型：0.0；字符类型：/uxxxx; 布尔类型：false;
    }
}
