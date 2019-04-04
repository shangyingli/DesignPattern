package com.example.factorypattern;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> tClass);
}
