package com.example.observerpattern.badOserver;

public class HanFiZi implements IHanFiZi {

    private boolean isHaveBreakfast;
    private boolean isHaveFun;

    public boolean isHaveBreakfast() {
        return isHaveBreakfast;
    }

    public void setHaveBreakfast(boolean haveBreakfast) {
        isHaveBreakfast = haveBreakfast;
    }

    public boolean isHaveFun() {
        return isHaveFun;
    }

    public void setHaveFun(boolean haveFun) {
        isHaveFun = haveFun;
    }


    @Override
    public void haveBreakfast() {
        System.out.println("韩非子在吃饭");
        isHaveBreakfast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子在玩");
        isHaveFun = true;
    }


}
