package com.example.interfaceisolateprincple;

public class Client {

    public static void main(String[] args) {

        //接口隔离原则

        System.out.println("---------气质型--------");

        IGreatTemperateGril temperateGril = new PrettyGril("aa");
        GreateTempSearcher tempSercher = new GreateTempSearcher(temperateGril);
        tempSercher.show();

        System.out.println("---------身材型--------");

        IGoodBodyGirl goodBodyGirl = new PrettyGril("bb");
        GoodBodySearcher prettyBodySercher = new GoodBodySearcher(goodBodyGirl);
        prettyBodySercher.show();

        System.out.println("---------气质身材型--------");
        IPrettyGirl prettyGirl = new PrettyGril("cc");
        PrettySercher seracher = new PrettySercher(prettyGirl);
        seracher.show();
    }
}
