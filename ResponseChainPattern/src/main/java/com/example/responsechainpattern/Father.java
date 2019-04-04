package com.example.responsechainpattern;

public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL);
    }

    @Override
    public void response(IWoman woman) {
        System.out.println("女儿向父亲请求 :");
        System.out.println(woman.getRequest());
        System.out.println("父亲同意");
    }
}
