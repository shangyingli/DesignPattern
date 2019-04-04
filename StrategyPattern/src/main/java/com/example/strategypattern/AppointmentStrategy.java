package com.example.strategypattern;

public class AppointmentStrategy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("约女生吃饭！");
    }
}
