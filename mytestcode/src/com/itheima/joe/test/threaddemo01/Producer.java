package com.itheima.joe.test.threaddemo01;

public class Producer implements Runnable{
    BoundedBuffer boundedBuffer ;

    public Producer(BoundedBuffer boundedBuffer) {
        this.boundedBuffer = boundedBuffer;
    }

    @Override
    public void run() {
        while (true) {
                boundedBuffer.put("烤鸭");
        }
    }
}
