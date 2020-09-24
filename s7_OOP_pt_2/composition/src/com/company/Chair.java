package com.company;

public class Chair {

    private Dimensions dimensions;
    private String material;
    private boolean padded;

    public Chair(Dimensions dimensions, String material, boolean padded) {
        this.dimensions = dimensions;
        this.material = material;
        this.padded = padded;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isPadded() {
        return padded;
    }

    public void placeChair() {
        System.out.println("Placed the chair more tastefully. Crushing it lad!");
    }
}
