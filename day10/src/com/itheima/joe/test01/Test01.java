package com.itheima.joe.test01;

public class Test01 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        USB mouse = new Mouse();
        USB keyboard = new KeyBoard();
        computer.openComputer();
        computer.useUSB(mouse);
        computer.useUSB(keyboard);
        computer.closeComputer();
    }
}
