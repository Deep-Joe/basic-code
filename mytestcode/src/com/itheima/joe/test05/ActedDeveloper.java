package com.itheima.joe.test05;

public class ActedDeveloper extends Developer implements Actor{
    public ActedDeveloper(String id, String name, int salary) {
        super(id, name, salary);
    }

    public ActedDeveloper() {
    }

    @Override
    public void play() {
        System.out.println("工号为" + this.getId() + "开发部员工" + getName() +"在唱歌");
    }
    /**
     * 4. 定义会表演的开发部员工类(ActedDeveloper)  继承 Developer实现 Actor接口
     a)	实现抽象方法 play
     i.	输出格式: 工号为XXX的开发部员工YYY在唱歌
     b)	提供空参,满参构造方法
     */

}
