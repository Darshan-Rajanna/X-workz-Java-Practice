package com.xworkz.vehicle;

public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("Vehicle Constructor: " + brand + " created.");
    }

    public void start() {
        System.out.println(brand + " is starting.");
    }

    public void stop() {
        System.out.println(brand + " is stopping.");
    }

    public void accelerate(int increase) {
        speed += increase;
        System.out.println(brand + " accelerated to " + speed + " km/h.");
    }

    public void applyBrakes(int decrease) {
        speed -= decrease;
        if (speed < 0) speed = 0;
        System.out.println(brand + " slowed down to " + speed + " km/h.");
    }

    public void honk() {
        System.out.println(brand + " is honking: Beep Beep!");
    }
}
