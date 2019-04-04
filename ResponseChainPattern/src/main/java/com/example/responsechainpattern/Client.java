package com.example.responsechainpattern;

public class Client {

    public static void main(String[] args) {
        new Client();
    }

    public Client() {

        IWoman woman = new Women("我要出去逛街", 3);
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNext(husband);
        husband.setNext(son);
        father.handleMessage(woman);
    }
}
