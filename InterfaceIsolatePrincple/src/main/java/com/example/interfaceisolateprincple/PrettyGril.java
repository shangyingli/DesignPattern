package com.example.interfaceisolateprincple;

public class PrettyGril implements IPrettyGirl{

    private String name;

    public PrettyGril(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name + " ---脸蛋很漂亮");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + " ---身材很好");
    }

    @Override
    public void goodTemperament() {
        System.out.println(this.name + " 气质很好---");
    }
}
