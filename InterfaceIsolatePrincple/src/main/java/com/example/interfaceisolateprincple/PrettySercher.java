package com.example.interfaceisolateprincple;

public class PrettySercher extends AbstractSeracher {

    public PrettySercher(IPrettyGirl prettyGirl) {
        super(prettyGirl);
    }

    @Override
    public void show() {
        this.prettyGirl.goodTemperament();
        this.prettyGirl.niceFigure();
        this.prettyGirl.goodLooking();
    }
}
