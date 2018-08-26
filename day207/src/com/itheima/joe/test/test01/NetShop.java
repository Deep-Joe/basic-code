package com.itheima.joe.test.test01;

import com.itheima.joe.demo.threadpool.ThreadPool;

/**
 *  2.定义一个官网线程类：NetShop，实现Runnable接口
 完成卖出水果的动作
 */
public class NetShop implements Runnable {
    private Fruit fruit ;

    public NetShop(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (fruit) {
                if (fruit.isFlag() == true) {
                    try {
                        fruit.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int stock = fruit.getStock();
                if (stock > 0) {
                    fruit.setStock(stock - 1);
                    int stock1 = fruit.getStock();
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + (100 + 1 -stock) +
                                "份还剩" + stock1 + "份");
                }
                fruit.setFlag(true);
                fruit.notifyAll();
            }
            if (fruit.getStock() <= 0) {
                break;
            }
        }
    }
}
