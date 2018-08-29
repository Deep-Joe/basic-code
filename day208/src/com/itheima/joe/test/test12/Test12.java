package com.itheima.joe.test.test12;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

//第二题：分析以下需求，并用代码实现
//	1.打印指定目录(不包含子目录)下所有的txt文件的名称(不打印文件夹路径)
//	2.获取指定目录(包含子目录)下所有的txt文件的个数,并打印文件名称
//	3.定义工具类IOUtils，里面有个方法描述如下(自行查找String类的API)：
//		public static ArrayList<String> getAllFileNames2List(File srcDir,String fileType)
//			参数File srcDir:源文本文件
//			参数String fileType:文件类型(比如：.doc,.txt,.java)
//			要求：将srcDir文件夹(包含子文件)所有扩展名为fileType的文件名称存入ArrayList<String>集合并返回
//	4.测试IOUtils工具类中的方法
public class Test12 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Joe\\Desktop\\17期黑马\\必看资料");
        method01(file);
        method02(file,"docx");
        ArrayList<String> docx = IOUtils.getAllFileNames2List(file, "docx");
        System.out.println(docx);
    }

    private static void method01(File file) {
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".docx");
            }
        });
        for (File file1 : files) {
            System.out.println(file1.getName());
        }
    }
    public static void method02(File file,String s) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                method02(file1,s);
            } else {
                if (file1.getName().endsWith(s)) {
                    System.out.println(file1.getName());
                }
            }
        }
    }
}
