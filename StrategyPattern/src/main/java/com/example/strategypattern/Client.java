package com.example.strategypattern;

/**
 * 策略者模式
 */

public class Client {

    public static void main(String[] args) {
        new Client();
    }

    public Client() {
        IStrategy appointmentStrategy = new AppointmentStrategy();
        IStrategy seeMovieStrategy = new SeeMovieStrategy();
        IStrategy confessionStrategy = new ConfessionStrategy();

        IAdapter adapter1 = new ContextAdapter(appointmentStrategy);
        adapter1.operate();

        IAdapter adapter2 = new ContextAdapter(seeMovieStrategy);
        adapter2.operate();

        IAdapter adapter3= new ContextAdapter(confessionStrategy);
        adapter3.operate();
    }
}
