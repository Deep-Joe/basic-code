package com.itheima.joe.test.test01;

public class FrontShop implements Runnable {
    private Fruit fruit;

    public FrontShop(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (fruit) {
                if (fruit.isFlag() == false) {
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
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + (100 + 1 - stock) +
                            "份还剩" + stock1 + "份");
                }
                fruit.setFlag(false);
                fruit.notifyAll();
            }
            if (fruit.getStock() <= 0) {
                break;
            }
        }
    }
}
