package com.example.builderpattern.criteriabuilder;

import java.util.ArrayList;

public abstract class CarModel {

    public static final String START = "start";
    public static final String STOP = "stop";
    public static final String ALARM= "alarm";
    public static final String BOOM = "boom";


    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void alarm();

    protected abstract void stop();

    protected abstract void enginBoom();

    final public void run() {
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = sequence.get(i);
            //todo 可改为switch -case
            if (START.equalsIgnoreCase(actionName)) {
                this.start();
            } else if (STOP.equalsIgnoreCase(actionName)) {
                this.stop();
            } else if (ALARM.equalsIgnoreCase(actionName)) {
                this.alarm();
            } else if (BOOM.equalsIgnoreCase(actionName)) {
                this.enginBoom();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
