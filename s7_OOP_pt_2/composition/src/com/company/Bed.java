package com.company;

public class Bed {

    private Dimensions dimensions;
    private Duvet duvet;
    private Pillow pillow;
    private String model;

    public Bed(Dimensions dimensions, Duvet duvet, Pillow pillow, String model) {
        this.dimensions = dimensions;
        this.duvet = duvet;
        this.pillow = pillow;
        this.model = model;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Duvet getDuvet() {
        return duvet;
    }

    public Pillow getPillow() {
        return pillow;
    }

    public String getModel() {
        return model;
    }

    public void makeBed() {
        System.out.println("Making bed. Your " + duvet.getCoverColour() + " duvet and " + pillow.getCoverColour() + " pillows look nice and neat now!");
    }
}
