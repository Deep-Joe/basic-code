package com.itheima.joe.demo;

import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("C:\\Users\\Joe\\Pictures\\smallyellower\\138448104748.jpg");
        File copyFile = new File("copy.jpg");
        InputStream inputStream = new FileInputStream(srcFile);
        OutputStream outputStream = new FileOutputStream(copyFile);
        copyFileMethod3(inputStream, outputStream);

    }

    public static void inputStreamMethod(InputStream inputStream) throws IOException {
        int len = 0;
        byte[] bytes = new byte[2];
        //inputStream.read(bytes) 返回读取字符的个数，当没有字符可以读取时返回一个 -1；
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, len));
        }
    }

    public static void copyFileMethod(File srcf, File copyf) throws IOException {
        //从文件读取
        InputStream inputStream = new FileInputStream(srcf);
        int read = 0;
        //写入到硬盘上的某个文件
        OutputStream outputStream = new FileOutputStream(copyf);
        while ((read = inputStream.read()) != -1) {
            outputStream.write(read);
        }
        outputStream.close();
        inputStream.close();
    }

    public static void copyFileMethod2(File srcf, File copyf) throws IOException {
        //从文件读取
        InputStream inputStream = new FileInputStream(srcf);
        int len = 0;
        byte[] bytes = new byte[1024];
        //写入到硬盘上的某个文件
        OutputStream outputStream = new FileOutputStream(copyf);
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
        outputStream.close();
        inputStream.close();
    }

    public static void copyFileMethod3(InputStream srcf, OutputStream copyf) throws IOException {
        //从文件读取
        BufferedInputStream bufferedInputStream = new BufferedInputStream(srcf);
        int len = 0;
        byte[] bytes = new byte[1024];
        //写入到硬盘上的某个文件
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(copyf);
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
    }
}
