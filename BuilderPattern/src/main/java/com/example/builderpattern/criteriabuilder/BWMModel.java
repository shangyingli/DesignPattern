package com.example.builderpattern.criteriabuilder;

public class BWMModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车跑起来的这样的");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车喇叭声音是这样的");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车应该这样停车");
    }

    @Override
    protected void enginBoom() {
        System.out.println("宝马车引擎是这样的声音");
    }
}
