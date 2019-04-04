package com.example.interfaceisolateprincple;

public abstract class AbstractSeracher {

    protected IGoodBodyGirl goodBodyGirl;
    protected IGreatTemperateGril greatTemperateGril;
    protected IPrettyGirl prettyGirl;

    public AbstractSeracher(IGoodBodyGirl goodBodyGirl) {
        this.goodBodyGirl = goodBodyGirl;
    }

    public AbstractSeracher(IGreatTemperateGril greatTemperateGril) {
        this.greatTemperateGril = greatTemperateGril;
    }

    public AbstractSeracher(IPrettyGirl prettyGirl) {
        this.prettyGirl = prettyGirl;
    }

    public abstract void show();
}
