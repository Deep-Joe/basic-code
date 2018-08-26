package com.itheima.joe.test.test01;

/**
 * 一、根据需求实现代码
 1.定义一个Fruit水果类
 成员变量：stock库存
 构造方法、set和get
 2.定义一个官网线程类：NetShop，实现Runnable接口
 完成卖出水果的动作
 3.定义一个实体店线程类：FrontShop，实现Runnable接口
 完成卖出水果的动作
 4.使用等待唤醒机制完成卖出100份坚果的功能
 例如：
 官网正在卖出第1份，还剩余99份
 实体店正在卖出第2份，还剩余98份
 官网正在卖出第3份，还剩余97份
 实体店正在卖出第4份，还剩余96份
 ...

 步骤分析：
  1.在Fruit类中设置库存量stock库存量
  2.在Fruit类中设置一个是否已经被某个线程占用的状态量boolean hasNext;
  3.当在官网卖出的时候hasNext = true 则 fruit.wait(); 当被唤醒时则卖出去第count份，还剩sotock - count 量
  4.实体店线程同理
 */
public class Test01 {
    public static void main(String[] args) {
        Fruit fruit = new Fruit(100);
        NetShop netShop = new NetShop(fruit);
        FrontShop frontShop = new FrontShop(fruit);
        new Thread(netShop,"官网").start();
        new Thread(frontShop,"实体店").start();
    }
}
