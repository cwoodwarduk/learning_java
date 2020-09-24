package com.company;

public class Printer {

    private int tonerLevel = 0;
    private int pagesRequired;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >=0 && ((this.tonerLevel + tonerLevel) <= 100)){
            this.tonerLevel += tonerLevel;
            System.out.println("Printer toner level is " + this.tonerLevel + "%.");
        } else {
            System.out.println("Invalid toner level given.");
        }

        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesRequired() {
        return pagesRequired;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void fillToner(int tonerLevel) {
        if (tonerLevel >=0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            System.out.println("Invalid toner level given.");
        }
    }

    public void printPages(int pages) {
        if (pages > 0){
            this.pagesRequired = pages;
        } else {
            System.out.println("Invalid number of pages given.");
        }

        if (duplex) {
            System.out.println("Printing " + pagesRequired + " pages over " + (pagesRequired/2 + pagesRequired%2) + " sheets of paper.");
        } else {
            System.out.println("Printing " + pagesRequired + " pages over " + pagesRequired + " sheets of paper.");
        }
    }
}
