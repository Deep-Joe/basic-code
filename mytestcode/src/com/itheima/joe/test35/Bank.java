package com.itheima.joe.test35;

public class Bank {
    /*
    定义“银行类”Bank，包含满参构造方法和以下成员：
             成员属性:
    余额balance (int类型)
             非静态成员方法：
                  存钱方法void save(int  inMoney)
           方法内完成存钱的功能(余额加存入金额inMoney) ,打印输出存钱后余额
                  取钱方法void draw(int outMoney)
           方法内完成取钱的功能(余额减取出金额outMoney) ,打印输出取钱后余额
     */
    private int balance;

    public Bank() {
    }

    public Bank(int balance) {

        this.balance = balance;
    }

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    // 非静态成员方法：
    //                  存钱方法void save(int  inMoney)
    //           方法内完成存钱的功能(余额加存入金额inMoney) ,打印输出存钱后余额
    //                  取钱方法void draw(int outMoney)
    //           方法内完成取钱的功能(余额减取出金额outMoney) ,打印输出取钱后余额
    public void save(int inMoney) {
        this.setBalance(this.balance + inMoney);
        System.out.println("存钱后的余额" + this.getBalance());
    }

    public void draw(int outMoney) {
        this.setBalance(this.balance - outMoney);
        System.out.println("取钱后的余额: " + this.getBalance());
    }
}
