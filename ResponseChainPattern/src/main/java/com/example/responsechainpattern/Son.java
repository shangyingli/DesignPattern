package com.example.responsechainpattern;

public class Son extends Handler {

    public Son() {
        super(Handler.SON_LEVEL);
    }

    @Override
    public void response(IWoman woman) {
        System.out.println("母亲向儿子请求 :");
        System.out.println(woman.getRequest());
        System.out.println("儿子同意");
    }
}
