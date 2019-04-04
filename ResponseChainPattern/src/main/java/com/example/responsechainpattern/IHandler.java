package com.example.responsechainpattern;

public interface IHandler {

    void handleMessage(IWoman woman);

    void setNext(Handler handler);

    void response(IWoman woman);
}
