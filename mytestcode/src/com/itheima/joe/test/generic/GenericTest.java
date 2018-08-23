package com.itheima.joe.test.generic;

public class GenericTest<MVP> {
    private MVP mvp;

    public MVP getMvp() {
        return mvp;
    }

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }

    public <E> void show1(E e) {
        System.out.println(e.getClass());
    }

    public <E> E show(E e) {
        return e;
    }
}
