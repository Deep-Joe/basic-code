package com.itheima.joe.test.threadtest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
/*有一个抽奖池,该抽奖池中存放了奖励,该抽奖池中的奖项为 {"魅族E","畅玩6X","坚果Pro","小米Note2","iphone 7Plus","一加手机 5","三星 Galaxy S6","华为p10 Plus","OPPO A77","华为荣耀 V9","努比亚 Z17","Moto Z Play"};
创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”，随机从抽奖池中获取奖项元素并打印在控制台上,格式如下:

2.每次抽的过程中，不打印，抽完时一次性打印(不要求交替抽奖，每个奖项只能被抽取一次),打印格式如下（以下是三次随机运行的效果）：
第一次运行效果：
在此次抽奖过程中，抽奖箱2总共产生了6个奖项，分别为：[华为p10 Plus,iphone 7Plus,魅族E,小米Note2,OPPO A77,华为荣耀 V9]
在此次抽奖过程中，抽奖箱1总共产生了6个奖项，分别为：[三星 Galaxy S6,坚果Pro,一加手机 5,努比亚 Z17,Moto Z Play,畅玩6X]

第二次运行的效果：
在此次抽奖过程中，抽奖箱1总共产生了12个奖项，分别为：[OPPO A77,魅族E,努比亚 Z17,Moto Z Play,畅玩6X,坚果Pro,华为p10 Plus,一加手机 5,iphone 7Plus,小米Note2,三星 Galaxy S6,华为荣耀 V9]
在此次抽奖过程中，抽奖箱2没有抽到奖项，下次努力~

第三次运行的效果：
在此次抽奖过程中，抽奖箱1总共产生了7个奖项，分别为：[OPPO A77,小米Note2,iphone 7Plus,三星 Galaxy S6,华为荣耀 V9,华为p10 Plus,坚果Pro]
在此次抽奖过程中，抽奖箱2总共产生了5个奖项，分别为：[魅族E,一加手机 5,Moto Z Play,努比亚 Z17,畅玩6X]

注意：
1.每个奖项只能被抽取1次
2.抽完后一次性打印，而不是抽一次打印一次
3.如果一个奖项都没抽到，打印格式如下：
       在此次抽奖过程中，抽奖箱x没有抽到奖项，下次努力~（x表示1或者2）

 */
public class Test {
    public static void main(String[] args) {
        LotteryPool lotteryPool = new LotteryPool();
//        new Thread(lotteryPool).start();
//        new Thread(lotteryPool).start();
//        new Thread(lotteryPool).start();
//        ExecutorService executorServicee = Executors.newFixedThreadPool(3);
//        executorServicee.submit(lotteryPool);
//        executorServicee.submit(lotteryPool);
//        executorServicee.submit(lotteryPool);
        Test t = null;
        t.m();
        System.out.println(t);
    }

    public static void m() {
        System.out.println("m()");
    }
}
