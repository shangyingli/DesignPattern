package com.example.observerpattern.googObserver;

import java.util.Observable;
import java.util.Observer;

public class Lisi implements Observer {

//    @Override
//    public void update(String context) {
//        System.out.println("李斯 : 观察到韩非子有活动,上报给秦始皇");
//        reportToQsh(context);
//        System.out.println("李斯 : 汇报完毕");
//    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("李斯 : 观察到韩非子有活动,上报给秦始皇");
        reportToQsh(o.toString());
        System.out.println("李斯 : 汇报完毕");
    }

    private void reportToQsh(String event) {
        System.out.println(" 李斯 : 报告秦始皇， 韩非有活动了 -> " + event);
    }

}
