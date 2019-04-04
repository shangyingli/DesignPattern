package com.example.builderpattern.criteriabuilder;

import java.util.ArrayList;

public class BWMBuilder extends CarBuilder {

    private CarModel bm = new BWMModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bm.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bm;
    }
}
