package com.example.lpsprinciple.gun;

public class Client {

    public static void main(String[] args) {
//        Soldier sanMao = new Soldier();
//        sanMao.setGun(new Rifle());
//        sanMao.killEnemy();

        Snipper snipper = new Snipper();
        snipper.setRifle((Aug) new Rifle());
        snipper.killEnemy();
    }
}
