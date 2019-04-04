package com.example.strategypattern;

import org.omg.CORBA.PRIVATE_MEMBER;

public class ContextAdapter implements IAdapter {

    private IStrategy strategy;

    public ContextAdapter(IStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void operate() {
        this.strategy.operate();
    }
}
