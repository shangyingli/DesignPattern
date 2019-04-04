package com.example.builderpattern.criteriabuilder;

import java.util.ArrayList;

public class BenziBuilder extends CarBuilder {

    private CarModel benz = new BenziModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
