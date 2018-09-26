package com.itheima.joe.test.shoptest;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class testmain {
    public static void main(String[] args) throws IOException, ParseException {
        //1.当程序执行后,会让用户选择是否参加秒杀活动，图如下：
        System.out.println("请选择是否参加秒杀活动（1.代表参加；2.代表不参加）");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            //2.1代表参加秒杀活动,程序可以继续执行,进入下一步操作
            if (num == 1) {
                //3 设置秒杀活动的时间
                //3.1如果用户选择参加秒杀活动，先检查是否是否已经超过了秒杀活动的时间.
            /*
            i>	先检查在该项目模块中是否有endtime.properties文件
                a)	如果有该文件，则将键endtime所对应的时间值修改为2018年10月1日 12:00:00
                b)	如果没有该文件,则新创建一个endtime.properties文件,并将endtime作为键, 2018年10月1日 12:00:00作为值存入到该文件中。
             */
                File fileEndtime = new File("E:\\ideawork\\basic-code\\mytestcode\\src\\com\\itheima\\joe\\test\\shoptest\\endTime.properties");
                if (!fileEndtime.exists()) {
                    fileEndtime.createNewFile();
                }
                InputStream is = new FileInputStream(fileEndtime);
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                Properties properties = new Properties();
                properties.load(br);
                br.close();
                String endTime = properties.getProperty("endTime");
                if (endTime == null) {
                    properties.setProperty("endTime", "2018年10月1日 12:00:00");
                    endTime = properties.getProperty("endTime");
                }
            /*
                ii>	读取配置文件endtime.properties中的时间，并与当前时间进行判断
             */
                DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                Date date = df.parse(endTime);
                long time = date.getTime();
                if (time <= System.currentTimeMillis()) {
                    //a)	如果当前时间大于或者等于了配置文件中读取到的时间，证明秒杀活动已经截止,结束程序并给与提示
                    System.out.println("很遗憾，活动时间已经结束,请关注下一次活动!!");
                } else {
                    //b)	如果当前时间小于，配置文件中的时间。程序继续！
                /*  i>商品分类的显示
                    在当前模块中有一个”仓库.txt”文件,该文件中存放的是商品分类信息,该商品分类信息是以键值对的方式存储的.
                    先读取该商品分类信息,并显示到控制台：
                 */
                    BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\ideawork\\basic-code\\mytestcode\\src\\com\\itheima\\joe\\test\\shoptest\\仓库.txt"));
                    PrintWriter printWriter = new PrintWriter(System.out);
                    Properties properties1 = new Properties();
                    properties1.load(bufferedReader);
                    printWriter.println("参与秒杀活动的商品分类信息如下：");
                    String proString = properties1.toString();
                    printWriter.println(proString.substring(1,proString.length() - 1));
                    printWriter.flush();
                /*
                ii>	选择商品的分类

                 */
                    int num1 = sc.nextInt();
                    String fileName = properties1.getProperty(num1 + "");
                    if (fileName == null) {
                        System.out.println("您选择的商品分类不存在，请选择还要继续参加秒杀活动么？");
                        continue;
                    } else {
                        File file = new File("E:\\ideawork\\basic-code\\mytestcode\\src\\com\\itheima\\joe\\test\\shoptest\\" + fileName + ".txt");
                        BufferedReader fileBR = new BufferedReader(new FileReader(file));
                        String fileLine;
                        while ((fileLine = fileBR.readLine()) != null) {
                            printWriter.println(fileLine);
                            printWriter.flush();
                        }
                    }
                    bufferedReader.close();
                    printWriter.close();

                }

            } else {
                //2.2代表不参加秒杀活动,程序结束,并给与提示：“谢谢您的使用,欢迎下次光临！！！”
                System.out.println("谢谢您的使用，欢迎下次光临！！！");
                break;
            }
        }


    }

    public static void formateFile(File file) {


    }
}
