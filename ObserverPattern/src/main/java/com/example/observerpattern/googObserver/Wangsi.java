package com.example.observerpattern.googObserver;

public class Wangsi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("王斯 : 观察到韩非子有活动,上报给秦始皇");
        reportToQsh(context);
        System.out.println("王斯 : 汇报完毕");
    }

    private void reportToQsh(String event) {
        System.out.println(" 王斯 : 报告秦始皇， 韩非有活动了 -> " + event);
    }


}
