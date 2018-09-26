package com.itheima.joe.test.shoptest;
/*
Goods类：秒杀商品信息的，包含字段有(商品品牌(String brand)，商品数量（int num）,商品产地（String address），商品单价（double  price）)
 */
public class Goods {
    private String brand;
    private int num;
    private String address;
    private double price;

    public Goods() {
    }

    public Goods(String brand, int num, String address, double price) {

        this.brand = brand;
        this.num = num;
        this.address = address;
        this.price = price;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "brand='" + brand + '\'' +
                ", num=" + num +
                ", address='" + address + '\'' +
                ", price=" + price +
                '}';
    }
}
