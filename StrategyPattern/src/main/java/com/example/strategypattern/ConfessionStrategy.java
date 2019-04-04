package com.example.strategypattern;

public class ConfessionStrategy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("向女生表白！");
    }
}
