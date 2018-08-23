package com.itheima.joe.test23;

import java.util.ArrayList;

public class Test23 {
    /*
    3.【代码题】
1.定义Person类, 包含以下成员:
成员属性:
    name (姓名)：String类型;
    height (身高) ：double类型;
    weight (体重) ：int类型，
    属性使用private修饰。
成员方法:
    1).get/set方法
    2).无参无返回值的非静态showBMI()方法, 打印对象的姓名,体重,身高和体质指数:
    体质指数=体重÷(身高*身高);
2. 定义Test类：在main()方法中，按以下要求编写代码:
    1） 分别实例化三个Person对象，三个对象分别为："小秋" ,1.72, 72、"小红" ,1.58, 44、"小白" ,1.80, 55;
    2） 创建一个ArrayList集合，这个集合里面存储的是Person类型，分别将上面的三个Person对象添加到集合中
    3）遍历这个集合，将集合中姓名为小白的对象，体重增加10kg，然后调用这个对象的showBMI方法展示这个对象的属性和体质指数.

     */
    public static void main(String[] args) {
        Person person01 = new Person("小秋",1.72,72);
        Person person02 = new Person("小红",1.58,44);
        Person person03 = new Person("小白",1.80,55);
        ArrayList<Person> list = new ArrayList<>();
        list.add(person01);
        list.add(person02);
        list.add(person03);
        for (int i = 0; i < list.size(); i++) {
            Person person = list.get(i);
            if (person.getName() == "小白") {
                person.setWeight(person.getWeight() + 10);
                person.showBMI();
            }
        }
    }
}
