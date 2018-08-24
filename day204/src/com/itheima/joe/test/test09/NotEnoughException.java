package com.itheima.joe.test.test09;

public class NotEnoughException extends Exception{
    public NotEnoughException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
