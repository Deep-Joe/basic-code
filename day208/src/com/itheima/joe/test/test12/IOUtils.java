package com.itheima.joe.test.test12;

import java.io.File;
import java.util.ArrayList;

public class IOUtils {
    //定义工具类IOUtils，里面有个方法描述如下(自行查找String类的API)：
    ////		public static ArrayList<String> getAllFileNames2List(File srcDir,String fileType)
    ////			参数File srcDir:源文本文件
    ////			参数String fileType:文件类型(比如：.doc,.txt,.java)
    ////			要求：将srcDir文件夹(包含子文件)所有扩展名为fileType的文件名称存入ArrayList<String>集合并返回
    public static ArrayList<String> getAllFileNames2List(File srcDir, String fileType) {
        File[] files = srcDir.listFiles();
        ArrayList<String> list = new ArrayList<>();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    list.addAll(getAllFileNames2List(file1, fileType));
                } else {
                    if (file1.getName().endsWith(fileType)) {
                        list.add(file1.getName());
                    }
                }
            }
        }
        return list;
    }
}
