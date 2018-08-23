package com.itheima.joe.test.test08;

import java.util.HashMap;

public class VendingMachine {
    private String name;
    private HashMap<String,Float> list;
    private Float lastMoney;

    public VendingMachine() {
    }

    public VendingMachine(String name, HashMap<String, Float> list, Float lastMoney) {

        this.name = name;
        this.list = list;
        this.lastMoney = lastMoney;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Float> getList() {
        return list;
    }

    public void setList(HashMap<String, Float> list) {
        this.list = list;
    }

    public Float getLastMoney() {
        return lastMoney;
    }

    public void setLastMoney(Float lastMoney) {
        this.lastMoney = lastMoney;
    }

    /**
    3.在VendingMachine类中定义购买饮料的方法：
    传入钞票和饮料名称后，需要判断传入的钞票是否为真、面值是否足够购买此类饮料；若不符合购买条件给出错误提示，结束购买流程；
    若购买成功后需打印出找零金额和目前机内现金总额；
     */
    public void buyDrink(Money money,String s) {
        if (money.isTrue()) {
            Float price = list.get(s);
            if (money.getValue() >= price) {
                System.out.println("向售货机投入" + money.getValue() + "元的真币在" + this.getName() + "成功购买一瓶"+ s +
                        "找零" + (money.getValue() - price) + "目前机内现金总额" + (this.getLastMoney() + money.getValue()));
            } else {
                System.out.println("对不起您投的金额不足");
            }
        } else {
            System.out.println("对不起您头的钞票是假的");
        }
    }
}
