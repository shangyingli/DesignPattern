package com.example.interfaceisolateprincple;

public class GreateTempSearcher extends AbstractSeracher {

    public GreateTempSearcher(IGreatTemperateGril greatTemperateGril) {
        super(greatTemperateGril);
    }

    @Override
    public void show() {
        this.greatTemperateGril.goodTemperament();
    }
}
