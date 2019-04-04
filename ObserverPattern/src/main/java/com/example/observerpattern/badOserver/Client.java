package com.example.observerpattern.badOserver;

public class Client {
    public static void main(String[] args) {

        HanFiZi hanFiZi = new HanFiZi();
        Lisi lisi = new Lisi();
        //监控韩非子吃饭
        Watcher watcherBre = new Watcher(hanFiZi, lisi, Watcher.HAVE_BRE);
        watcherBre.start();
        //监控韩非子娱乐
        Watcher watcherFun = new Watcher(hanFiZi, lisi, Watcher.HAVE_FUN);
        watcherFun.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hanFiZi.haveBreakfast();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hanFiZi.haveFun();
    }
}
