package com.example.responsechainpattern;

import org.jetbrains.annotations.NotNull;

public abstract class Handler implements IHandler {

    protected static final int FATHER_LEVEL = 1;
    protected static final int HUSBAND_LEVEL = 2;
    protected static final int SON_LEVEL = 3;

    private int level;
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    @Override
    public final void handleMessage(@NotNull IWoman woman) {
        if (woman.getType() == this.level) {
            this.response(woman);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handleMessage(woman);
            } else {
                System.out.println("没有人处理请求");
            }
        }
    }

    @Override
    public final void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }


}
