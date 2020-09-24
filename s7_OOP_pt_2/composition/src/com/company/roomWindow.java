package com.company;

public class roomWindow {

    private Dimensions dimensions;
    private boolean isOpen;

    public roomWindow(Dimensions dimensions, boolean isOpen) {
        this.dimensions = dimensions;
        this.isOpen = isOpen;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void openCloseWindow() {
        if (isOpen){
            System.out.println("Closed window.");
        } else {
            System.out.println("Opened window.");
        }
    }
}
