package com.example.strategypattern;

public class SeeMovieStrategy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("约女生看电影！");
    }
}
