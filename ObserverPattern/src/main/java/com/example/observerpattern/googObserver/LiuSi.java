package com.example.observerpattern.googObserver;

public class LiuSi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("刘斯 : 观察到韩非子有活动,上报给秦始皇");
        reportToQsh(context);
        System.out.println("刘斯 : 汇报完毕");
    }

    private void reportToQsh(String event) {
        System.out.println(" 刘斯 : 报告秦始皇， 韩非有活动了 -> " + event);
    }
}
