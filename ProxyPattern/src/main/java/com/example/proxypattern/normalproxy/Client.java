package com.example.proxypattern.normalproxy;

public class Client {

    public static void main(String[] args) {

        GamePlayerProxy playerProxy = new GamePlayerProxy("张三");
        System.out.println("开始时间时 : " + System.currentTimeMillis());
        playerProxy.login("zhangsan", "123456");
        playerProxy.killBoss();
        playerProxy.upgrade();
        System.out.println("结束时间时 : " + System.currentTimeMillis());
    }
}
