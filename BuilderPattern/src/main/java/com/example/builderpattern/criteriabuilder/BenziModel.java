package com.example.builderpattern.criteriabuilder;

public class BenziModel extends CarModel {

    @Override
    protected void start() {
       System.out.println("奔驰车跑起来的这样的");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车喇叭声音是这样的");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车应该这样停车");
    }

    @Override
    protected void enginBoom() {
        System.out.println("奔驰车引擎是这样的声音");
    }

}
