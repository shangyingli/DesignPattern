package com.example.observerpattern.badOserver;

import com.example.observerpattern.badOserver.ILisi;

public class Lisi implements ILisi {

    @Override
    public void update(String context) {
        System.out.println("观察到韩非子有活动,上报给秦始皇");
        reportToQsh(context);
        System.out.println("李斯汇报完毕");
    }

    private void reportToQsh(String event) {
        System.out.println("报告秦始皇， 韩非有活动了 -> " + event);
    }
}
