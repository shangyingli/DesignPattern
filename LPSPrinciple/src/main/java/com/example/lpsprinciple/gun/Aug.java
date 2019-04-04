package com.example.lpsprinciple.gun;

public class Aug extends Rifle {

    public void ZoomOut() {
        System.out.println("狙击枪通过望远镜观察敌人");
    }

    @Override
    public void shoot() {
        System.out.println("Aug 射击");
    }
}
