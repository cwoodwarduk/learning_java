package com.company;

public class Pillow {
    private boolean memoryFoam;
    private String coverColour;

    public Pillow(boolean memoryFoam, String coverColour) {
        this.memoryFoam = memoryFoam;
        this.coverColour = coverColour;
    }

    public boolean isMemoryFoam() {
        return memoryFoam;
    }

    public String getCoverColour() {
        return coverColour;
    }
}
