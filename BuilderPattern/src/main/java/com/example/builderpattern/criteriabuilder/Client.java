package com.example.builderpattern.criteriabuilder;

public class Client {

    public static void main(String[] args) {
//        ArrayList<String> sequence = new ArrayList<String>();
//        sequence.add(CarModel.BOOM);
//        sequence.add(CarModel.START);
//        sequence.add(CarModel.STOP);
//        BenziBuilder benziBuilder = new BenziBuilder();
//        benziBuilder.setSequence(sequence);
//        CarModel bz = benziBuilder.getCarModel();
//        bz.run();

        Director director = new Director();
        CarModel benziModelA = director.getABenziModel();
        benziModelA.run();

        CarModel benziModelB = director.getBBenziModel();
        benziModelB.run();

        CarModel bmModelA = director.getABMModel();
        bmModelA.run();

        CarModel bmModelB = director.getBBMModel();
        bmModelA.run();
    }
}
