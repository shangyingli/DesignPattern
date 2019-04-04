package com.example.interfaceisolateprincple;

public class GoodBodySearcher extends AbstractSeracher {


    public GoodBodySearcher(IGoodBodyGirl goodBodyGirl) {
        super(goodBodyGirl);
    }

    @Override
    public void show() {
        this.goodBodyGirl.niceFigure();
        this.goodBodyGirl.goodLooking();
    }
}
