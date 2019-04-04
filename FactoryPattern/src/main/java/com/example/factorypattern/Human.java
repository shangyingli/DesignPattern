package com.example.factorypattern;

public abstract class Human {

    public abstract void getColor();

    public abstract void talk();

    public void commandMethod() {
        System.out.println("我们都是人");
    }
}
