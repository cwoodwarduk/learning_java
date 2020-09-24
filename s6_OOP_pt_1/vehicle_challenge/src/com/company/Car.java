package com.company;

public class Car extends Vehicle {

    private String manufacturer;
    private String model;
    private int seats;

    public Car(int wheels, int speed, int gear, String steeringDirection, String manufacturer, String model, int seats) {
        super(wheels, speed, gear, steeringDirection);
        this.manufacturer = manufacturer;
        this.model = model;
        this.seats = seats;
    }

}
