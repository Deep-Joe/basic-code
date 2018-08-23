package com.itheima.joe.test.test03;

public class Person {
    /*

	4.定义Person类
		属性：
			姓名，年龄

		生成空参有参构造，set和get方法
     */
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    行为：
			keepPet(Dog dog,String something)方法
				功能：喂养宠物狗，something表示喂养的东西
		行为：
			keepPet(Cat cat,String something)方法
				功能：喂养宠物猫，something表示喂养的东西
     */
    public void keepPet(Dog dog, String something) {
        dog.eat(something);
    }

    public void keepPet(Cat cat, String something) {
        cat.eat(something);
    }

}
