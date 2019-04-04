package com.example.observerpattern.googObserver;

import java.util.Observable;
import java.util.Observer;

public class Client {

    public static void main(String[] args) {

        //使用自定义的observer和observable
//        Observable hanfeizi = new HanFiZi();
//        Observer lisi = new Lisi();
//        Observer liusi = new LiuSi();
//        Observer wangsi = new Wangsi();
//        hanfeizi.addObserver(lisi);
//        hanfeizi.addObserver(wangsi);
//        hanfeizi.addObserver(liusi);
//
//        ((HanFiZi) hanfeizi).haveBreakfast();

        //使用java.util包中的observer和observable
        Observable han = new HanFiZi();
        Observer lisi = new Lisi();
        han.addObserver(lisi);

        ((HanFiZi) han).haveBreakfast();

    }
}
