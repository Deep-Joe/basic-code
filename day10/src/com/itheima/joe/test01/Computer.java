package com.itheima.joe.test01;

public class Computer {
    /*
	2.定义笔记本类:
		开机功能
		关机功能
		定义使用USB设备的功能
		要求:既能使用鼠标也能使用键盘,使用USB功能内部调用开启和关闭功能
     */
    public void openComputer() {
        System.out.println("电脑开机了。。。");
    }

    public void closeComputer() {
        System.out.println("电脑关机了。。。");
    }

    public void useUSB(USB usb) {
        usb.open();
        if (usb instanceof KeyBoard) {
           KeyBoard keyBoard = (KeyBoard)usb;
           keyBoard.type();
        }
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }
        usb.close();
    }
}
