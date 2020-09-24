package com.company;

public class Vehicle {

    private int wheels;
    private int speed;
    private int gear;
    private String steeringDirection;

    public Vehicle(int wheels, int speed, int gear, String steeringDirection) {
        this.wheels = wheels;
        this.speed = speed;
        this.gear = gear;
        this.steeringDirection = steeringDirection;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void moving(int speed) {
        this.speed = speed;
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void changeDirection(String direction) {
        this.steeringDirection = direction;
    }
}
