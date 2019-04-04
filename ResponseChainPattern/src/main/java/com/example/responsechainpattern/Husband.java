package com.example.responsechainpattern;

public class Husband extends Handler {

    public Husband() {
        super(Handler.HUSBAND_LEVEL);
    }

    @Override
    public void response(IWoman woman) {
        System.out.println("妻子向丈夫请求 :");
        System.out.println(woman.getRequest());
        System.out.println("丈夫同意");
    }
}
