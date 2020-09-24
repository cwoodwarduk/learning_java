package com.company;

public class Maserati extends Car {
    private int yearOfManufacture;

    public Maserati(int wheels, int speed, int gear, String steeringDirection, String manufacturer, String model, int seats, int yearOfManufacture) {
        super(wheels, speed, gear, steeringDirection, manufacturer, model, seats);
        this.yearOfManufacture = yearOfManufacture;
    }
}
