package com.itheima.joe.test25;

public class Test25 {
    /*
    根据要求完成以下功能：
①  定义接口Fitness，要求如下：
      定义抽象方法： void fitnessPlan(Plan p)
      定义默认方法： void info()，要求：依次调用sport1()，sport2 ()
      定义私有方法： void sport1 (),要求：输出"每天动一动，享受健康生活"
                              void sport2(),要求：输出"记得要做热身运动哦"
②  定义类Plan，包含空参、满参构造和以下成员变量
        热身 ready（String 型）
        锻炼 exercise（String 型）
        生成所有成员变量set/get方法
定义成员方法：void printPlan(),要求：输出打印"当次运动计划，热身：xxx，锻炼：yyy",
PS： xxx为变量ready值，yyy为变量exercise值
③ 定义类Person，包含空参、满参构造和以下成员变量
        姓名 name（String 型）
        年龄 age（int型）
        生成所有成员变量set/get方法
        定义成员方法：void startExercise (Fitness  fitness)，要求：输出“xxx开始锻炼”，然后在方法内依次调用info()，fitnessPlan(Plan p)
PS：xxx为变量name值，参数p需要自行创建并初始化变量ready与 exercise
④ 定义测试类Test，在main方法实现以下功能：
      创建并初始化一个Person对象per，调用方法 startExercise (Fitness  fitness)
     参数：fitness为Fitness的实现类，需要实现fitnessPlan(Plan p)抽象方法，
     实现要求：调用参数p的printPlan ()方法
     */
    public static void main(String[] args) {
        Person pre = new Person("张三",18);
        ////////////////////////////////////////////////////
        pre.startExercise(new Fiteness() {
            @Override
            public void fitnessPlan(Plan p) {
                p.printPlan();
            }
        }); //匿名内部类作为实际参数进行传递；
        ///////////////////////////////////////////
    }
}
