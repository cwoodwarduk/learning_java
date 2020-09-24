package com.company;

import java.awt.*;

public class Bedroom {

    private Dimensions dimensions;
    private Bed bed;
    private roomWindow window;
    private Desk desk;
    private Chair chair;

    public Bedroom(Dimensions dimensions, Bed bed, roomWindow window, Desk desk, Chair chair) {
        this.dimensions = dimensions;
        this.bed = bed;
        this.window = window;
        this.desk = desk;
        this.chair = chair;
    }

    private Dimensions getDimensions() {
        return dimensions;
    }

    private Bed getBed() {
        return bed;
    }

    private roomWindow getWindow() {
        return window;
    }

    private Desk getDesk() {
        return desk;
    }

    private Chair getChair() {
        return chair;
    }

    public void cleanRoom() {
        System.out.println("Hoovered " + ((getDimensions().getWidth() / 100) * (getDimensions().getDepth() / 100)) + " square meters of carpet. Didn't you do well!");
        getBed().makeBed();
        getWindow().openCloseWindow();
        getDesk().tidyDesk();
        getChair().placeChair();
    }

}
