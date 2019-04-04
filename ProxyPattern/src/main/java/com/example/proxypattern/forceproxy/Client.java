package com.example.proxypattern.forceproxy;

public class Client {

    public static void main(String[] args) {

        try {
            IGamePlayer gamePlayer = new GamePlayer("张三");
            IGamePlayer proxy = gamePlayer.getProxy();
            System.out.println("开始时间时 : " + System.currentTimeMillis());
             proxy.login("zhangsan", "123456");
             proxy.killBoss();
             proxy.upgrade();
            System.out.println("结束时间时 : " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
