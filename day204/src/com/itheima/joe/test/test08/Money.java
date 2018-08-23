package com.itheima.joe.test.test08;

public class Money {
    private Float value;
    private boolean isTrue;
    public Money() {
    }

    public Money(Float value, boolean isTrue) {

        this.value = value;
        this.isTrue = isTrue;
    }

    public Float getValue() {

        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }
}
