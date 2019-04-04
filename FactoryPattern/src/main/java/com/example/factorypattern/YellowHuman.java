package com.example.factorypattern;

public class YellowHuman extends Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤时黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种说的时中文");
    }
}
