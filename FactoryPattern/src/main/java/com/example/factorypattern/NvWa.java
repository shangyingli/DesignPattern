package com.example.factorypattern;

public class NvWa {
    public static void main(String[] args) {

        //工厂模式

        AbstractHumanFactory humanFactory = new HumanFactory();
        System.out.println("造出的第一批人是黑色人种");
        BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        blackHuman.commandMethod();
        System.out.println("造出的第二批人是黄色人种");
        YellowHuman yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
        blackHuman.commandMethod();
    }
}
