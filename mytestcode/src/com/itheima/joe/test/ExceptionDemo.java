package com.itheima.joe.test;

public class ExceptionDemo {
    public static void main(String[] args) {

    }
}


class FuShuIndexException extends Exception
{
    FuShuIndexException()
    {}


    FuShuIndexException(String msg)
    {
        super(msg);
    }
}


class Demo1
{
    public int method(int[] arr,int index)throws FuShuIndexException
    {
        if(arr==null)
            throw new NullPointerException("没有任何数组实体");
        if(index<0)
            throw new FuShuIndexException();

        return arr[index];
    }
}
