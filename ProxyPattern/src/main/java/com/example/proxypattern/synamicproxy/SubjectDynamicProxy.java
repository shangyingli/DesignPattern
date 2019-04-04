package com.example.proxypattern.synamicproxy;

import com.example.proxypattern.forceproxy.GamePlayerProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(IGamePlayer gamePlayer) {
        ClassLoader classLoader = gamePlayer.getClass().getClassLoader();
        Class<?>[] classes = gamePlayer.getClass().getInterfaces();
        InvocationHandler invocationHandler = new GamePlayerIH(gamePlayer);
        return (T) Proxy.newProxyInstance(classLoader, classes, invocationHandler);
    }
}
