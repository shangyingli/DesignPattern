package com.example.lpsprinciple.father;

import java.util.HashMap;

public class Client {

    public static void invoker() {
        Father father = new Father();
        Son son = new Son();
        HashMap hashMap = new HashMap();
        son.doSomething(hashMap);
    }

    public static void main(String[] args) {
        invoker();
    }
}
