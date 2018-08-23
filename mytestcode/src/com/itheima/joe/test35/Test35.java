package com.itheima.joe.test35;

public class Test35 {
    /*
    五【代码题】
    定义“银行类”Bank，包含满参构造方法和以下成员：
             成员属性:
    余额balance (int类型)
             非静态成员方法：
                  存钱方法void save(int  inMoney)
           方法内完成存钱的功能(余额加存入金额inMoney) ,打印输出存钱后余额
                  取钱方法void draw(int outMoney)
           方法内完成取钱的功能(余额减取出金额outMoney) ,打印输出取钱后余额
    定义测试类Test，定义main方法，main方法内完成:
       创建一个Bank对象bk，设置余额为1000
       使用bk分别调用存钱和取钱的方法，传递的参数都为200
    演示格式如下：
    存钱完毕，余额：1200
    取钱完毕，余额：1000
     */
    public static void main(String[] args) {
        Bank bk = new Bank(1000);
        bk.save(200);
        bk.draw(200);
    }
}
