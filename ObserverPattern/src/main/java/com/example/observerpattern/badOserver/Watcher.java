package com.example.observerpattern.badOserver;

public class Watcher extends Thread{
    private HanFiZi hanFiZi;
    private Lisi lisi;
    private String type;

    public static final String HAVE_BRE = "breakfast";
    public static final String HAVE_FUN= "fun";


    public Watcher(HanFiZi hanFiZi, Lisi lisi, String type) {
        this.hanFiZi = hanFiZi;
        this.lisi = lisi;
        this.type = type;
    }

    @Override
    public void run() {
        //java虚拟机会一直运行， 导致AS崩溃
        while (true) {
            if (this.type.equalsIgnoreCase(HAVE_BRE)) {
                if (this.hanFiZi.isHaveBreakfast()) {
                    lisi.update("韩非子在吃饭");
                    this.hanFiZi.setHaveBreakfast(false);
                }
            } else {
                if (this.hanFiZi.isHaveFun()) {
                    lisi.update("韩非子在玩");
                    this.hanFiZi.setHaveFun(false);
                }
            }
        }
    }
}
