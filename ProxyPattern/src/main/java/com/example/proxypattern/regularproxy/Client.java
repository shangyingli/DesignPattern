package com.example.proxypattern.regularproxy;

public class Client {

    public static void main(String[] args) {

        IGamePlayer gamePlayer = new GamePlayer("张三");
        GamePlayerProxy playerProxy = new GamePlayerProxy(gamePlayer);
        System.out.println("开始时间时 : " + System.currentTimeMillis());
        playerProxy.login("zhangsan", "123456");
        playerProxy.killBoss();
        playerProxy.upgrade();
        System.out.println("结束时间时 : " + System.currentTimeMillis());
    }
}
