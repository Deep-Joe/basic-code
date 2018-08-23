package com.itheima.joe.demo.demo03;

import java.util.Arrays;

public class DemoLambda {
    public static void main(String[] args) {
        //核心代码：() -> sout("新的线程开启啦");
//        new Thread(() -> System.out.println("新的线程开启啦")).start();

      /*  invokeCook(() -> {
            System.out.println("吃饭啦");
        });*/

   /*   Person[] array = {
              new Person("古力娜扎",19),
              new Person("迪丽热巴",18),
              new Person("马尔扎哈",20)
      };
        Arrays.sort(array, (Person a, Person b) -> {
            return a.getAge() - b.getAge();
        });

        for (Person person : array) {
            System.out.println(person);
        }*/

       /* invokeCalc(120,130,(int a, int b) -> {
            return a +b;
        });*/

       //省略格式
        invokeCook(() -> System.out.println("吃饭啦"));
    }

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a,b);
        System.out.println("结果是：" +result);
    }
}
