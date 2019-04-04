package com.example.lpsprinciple.gun;

public class Snipper {

    private Aug aug;

    public void setRifle(Aug aug) {
        this.aug = aug;
    }

    public void killEnemy() {
        aug.ZoomOut();
        aug.shoot();
    }
}
