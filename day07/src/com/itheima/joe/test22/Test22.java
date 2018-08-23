package com.itheima.joe.test22;

import java.util.ArrayList;

public class Test22 {
    /*
    第二题
        1. 定义User类，包含属性：
        name: String类型
        age     : int类型
        2. 创建一个ArrayList集合对象list，集合内元素类型为User，实例化3个User对象，
        3个对象的属性分别为：”张三” 20， ”李四” 30， ”王五” 40，将3个对象添加到list集合中，
        并使用for循环遍历集合，将集合中age属性大于30的人的姓名在控制台打印出来。
     */
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user01 = new User("张三", 20);
        User user02 = new User("李四", 30);
        User user03 = new User("王五", 40);
        users.add(user01);
        users.add(user02);
        users.add(user03);
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getAge() > 30) {
                System.out.println(user.getName());
            }
        }
    }
}
