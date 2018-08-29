package com.itheima.joe.test.test02;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException{
        //
        //二、根据需求、完成代码
        //	1.项目根目录下建立两个文件夹：src和dest
        //	2.找一张图片放入src文件夹中
        //	3.将图片复制到dest文件夹中
        File fileSrc = new File("E:\\ideawork\\basic-code\\src\\143502967196.jpg");
        File fileDest= new File("E:\\ideawork\\basic-code\\dest\\copy.jpg");
        InputStream inputStream = new FileInputStream(fileSrc);
        OutputStream outputStream = new FileOutputStream(fileDest);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes,0,len);
        }
        outputStream.close();
        inputStream.close();

    }
}
