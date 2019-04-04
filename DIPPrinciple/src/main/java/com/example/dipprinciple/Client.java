package com.example.dipprinciple;

public class Client {

    //依赖倒置原则

    public static void main(String[] args) {

        IDriver driver = new Driver();

        ICar benzi = new Benzi();
        driver.driver(benzi);

        ICar bmw = new BMW();
        driver.driver(bmw);
    }
}
