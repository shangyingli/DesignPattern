package com.example.observerpattern.googObserver;

public interface Observable {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObserver(String context);
}
