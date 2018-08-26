package com.itheima.joe.test.test01;

/**
 * 成员变量：stock库存
 * 构造方法、set和get
 */
public class Fruit {
    private int stock;
    private boolean flag = true;

    public Fruit(int stock) {
        this.stock = stock;
    }

    public synchronized int getStock() {

        return stock;
    }

    public synchronized void setStock(int stock) {
        this.stock = stock;
    }

    public synchronized boolean isFlag() {
        return flag;
    }

    public synchronized void setFlag(boolean flag) {
        this.flag = flag;
    }
}
