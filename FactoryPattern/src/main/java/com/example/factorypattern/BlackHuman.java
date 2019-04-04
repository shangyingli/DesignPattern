package com.example.factorypattern;

public class BlackHuman extends Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤时黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话， 一般人听不懂");
    }
}
