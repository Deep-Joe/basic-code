package com.itheima.joe.demo;

import java.io.File;

public class DiGui {
    public static void main(String[] args) {
        int s = getSum(3);
//        System.out.println(s);

        int a = getJieCheng(5);
//        System.out.println(a);

//        File file = new File("C:\\Users\\Joe\\Desktop\\17期黑马\\5-8\\day08\\avi");
//        getAllFile(file);

      /*  File file = new File("C:\\Users\\Joe\\Desktop\\17期黑马\\5-8\\day08\\avi");
        deleteDir(file);
        file.delete();*/
     /* File file = new File("C:\\Users\\Joe\\Desktop\\17期黑马\\5-8\\day08\\code");
        int dirLength = getDirLength(file);
        System.out.println(dirLength);*/

      /*  File file = new File("r:\\a.txt");
        System.out.println(file);
        System.out.println(file.exists());*/
    }

    public static int getSum(int n) {
        if (n == 1 ) {
            return 1;
        }
        return getSum(n-1) +n;
    }

    public static int getJieCheng(int n) {
        if (n == 1 ) {
            return 1;
        }
        return getJieCheng(n -1) * n;
    }

    public static void getAllFile(File file) {
        File[] files = file.listFiles();
        //list()方法当文件不是目录或者权限不够时会返回null
        if (files != null) {
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    getAllFile(file1);
                } else {
                    System.out.println(file1);
                }
            }
        }
    }

    public static void deleteDir(File file) {
        File[] files = file.listFiles();
        //list()方法当文件不是目录或者权限不够时会返回null
        if (files != null) {
            for (File file1 : files) {
                if (file1.isFile()) {
                    file1.delete();
                } else {
                    deleteDir(file1);
                }
            }
        }
    }

    public static int getDirLength(File file) {
        File[] files = file.listFiles();
        int length = 0;
        //list()方法当文件不是目录或者权限不够时会返回null
        if (files != null) {
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    length += getDirLength(file1);
                } else {
                    length += file1.length();
                }
            }
        }
        return length;
    }
}
