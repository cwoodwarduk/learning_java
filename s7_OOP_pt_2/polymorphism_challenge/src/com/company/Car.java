package com.company;

public class Car {

    public String name;
    public boolean engine;
    public int wheels;
    public int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void accelerate() {
        System.out.println("Going faster.");
    }

    public void brake() {
        System.out.println("Slowing down.");
    }
}

class LandRover extends Car {

    public LandRover() {
        super("Land Rover", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Get the hammer and it'll start.");
    }

    @Override
    public void accelerate() {
        System.out.println("0-60 in 20 minutes.");
    }

    @Override
    public void brake() {
        System.out.println("This'll take a while.");
    }

}

class ArielAtom extends Car {

    public ArielAtom() {
        super("Ariel Atom", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Pushed the button. Time for takeoff.");
    }

    @Override
    public void accelerate() {
        System.out.println("0-60 in the blink of an eye.");
    }

    @Override
    public void brake() {
        System.out.println("Why would you want to slow down?");
    }

}

class KiaSportage extends Car {

    public KiaSportage() {
        super("Kia Sportage", 4);
    }
    
}
