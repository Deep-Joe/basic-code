package com.itheima.joe.test.shoptest;

import java.util.ArrayList;

/*
Person类：用户信息描述，包含字段（用户名称（String name）,用户联系方式（String tel），用户配送地址（String address）,购买商品是否需要配送（boolean dis））
	Distributionable<T>接口中有一个配送的方法：
		Void distribution(ArrayList<T> list)

 */
public class Person implements Distributionable{
    private String name;
    private String tel;
    private String address;
    private boolean dis;

    public Person() {
    }

    public Person(String name, String tel, String address, boolean dis) {

        this.name = name;
        this.tel = tel;
        this.address = address;
        this.dis = dis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isDis() {
        return dis;
    }

    public void setDis(boolean dis) {
        this.dis = dis;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", dis=" + dis +
                '}';
    }


    @Override
    public void distribution(ArrayList list) {

    }
}
