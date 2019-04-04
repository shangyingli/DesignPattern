package com.example.proxypattern.synamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {

    //被代理对象
    Object object;

    public GamePlayerIH(Object object) {
        this.object = object;
     }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method name : " + method.getName());
        Object result = method.invoke(this.object, args);
        return result;
    }
}
