package com.example.observerpattern.googObserver;

import com.example.observerpattern.badOserver.IHanFiZi;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class HanFiZi extends Observable implements IHanFiZi{

    private List<Observer> observableList = new ArrayList<Observer>();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子开始吃饭了");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
//        this.notifyObserver("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子开始玩了");
        super.setChanged();
        super.notifyObservers("韩非子在玩");
//        this.notifyObserver("韩非子在玩");
    }


//    @Override
//    public void addObserver(Observer observer) {
//        this.observableList.add(observer);
//    }
//
//    @Override
//    public void deleteObserver(Observer observer) {
//        this.observableList.remove(observer);
//    }
//
//    @Override
//    public void notifyObserver(String context) {
//        for (Observer observer : observableList) {
//            observer.update(context);
//        }
//    }
}
