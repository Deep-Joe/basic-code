package com.itheima.joe.test.threaddemo01;

public class Consumer implements Runnable {
    BoundedBuffer boundedBuffer;

    public Consumer(BoundedBuffer boundedBuffer) {
        this.boundedBuffer = boundedBuffer;
    }

    @Override
    public void run() {
        while (true) {
                boundedBuffer.take();
        }
    }
}
