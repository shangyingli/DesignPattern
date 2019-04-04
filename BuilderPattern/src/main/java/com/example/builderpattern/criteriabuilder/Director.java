package com.example.builderpattern.criteriabuilder;

import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequence = new ArrayList<String>();
    private CarBuilder benziBuilder = new BenziBuilder();
    private CarBuilder bwmBuilder = new BWMBuilder();

    public CarModel getABenziModel() {
        this.sequence.clear();
        this.sequence.add(CarModel.START);
        this.sequence.add(CarModel.STOP);
        this.benziBuilder.setSequence(sequence);
        return benziBuilder.getCarModel();
    }

    public CarModel getBBenziModel() {
        this.sequence.clear();
        this.sequence.add(CarModel.BOOM);
        this.sequence.add(CarModel.START);
        this.sequence.add(CarModel.STOP);
        this.benziBuilder.setSequence(sequence);
        return benziBuilder.getCarModel();
    }

    public CarModel getABMModel() {
        this.sequence.clear();
        this.sequence.add(CarModel.BOOM);
        this.sequence.add(CarModel.START);
        this.sequence.add(CarModel.STOP);
        this.bwmBuilder.setSequence(sequence);
        return this.bwmBuilder.getCarModel();
    }

    public CarModel getBBMModel() {
        this.sequence.clear();
        this.sequence.add(CarModel.START);
        this.sequence.add(CarModel.STOP);
        this.bwmBuilder.setSequence(sequence);
        return this.bwmBuilder.getCarModel();
    }
}
