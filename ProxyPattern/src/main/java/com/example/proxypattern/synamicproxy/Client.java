package com.example.proxypattern.synamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        IGamePlayer player = new GamePlayer("张三");
        System.out.println("开始时间时 : " + System.currentTimeMillis());
        IGamePlayer proxy = SubjectDynamicProxy.newProxyInstance(player);
        proxy.login("zhangsan", "123456");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间时 : " + System.currentTimeMillis());
    }
}
