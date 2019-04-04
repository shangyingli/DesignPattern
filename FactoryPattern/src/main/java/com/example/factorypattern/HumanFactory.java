package com.example.factorypattern;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> tClass) {
        Human human = null;
        try {
            human = (T)Class.forName(tClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("人类生成错误");
        }
        return (T) human;
    }
}
