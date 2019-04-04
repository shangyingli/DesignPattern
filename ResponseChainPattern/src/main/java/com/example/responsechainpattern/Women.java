package com.example.responsechainpattern;

public class Women implements IWoman {

    private String request;
    private int type;

    public Women(String request, int type) {
        this.type = type;
        switch (type) {
            case 1:
                this.request = "女儿的请求是 : " + request;
                break;
            case 2:
                this.request = "妻子的请求是 : " + request;
                break;
            case 3:
                this.request = "母亲的请求是 : " + request;
                break;
            default:
        }
    }

    @Override
    public String getRequest() {
        return request;
    }

    @Override
    public int getType() {
        return type;
    }
}
