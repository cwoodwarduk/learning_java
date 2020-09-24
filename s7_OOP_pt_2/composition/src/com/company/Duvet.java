package com.company;

public class Duvet {

    private int tog;
    private String size;
    private String coverColour;

    public Duvet(int tog, String size, String coverColour) {
        this.tog = tog;
        this.size = size;
        this.coverColour = coverColour;
    }

    public int getTog() {
        return tog;
    }

    public String getSize() {
        return size;
    }

    public String getCoverColour() {
        return coverColour;
    }

}
