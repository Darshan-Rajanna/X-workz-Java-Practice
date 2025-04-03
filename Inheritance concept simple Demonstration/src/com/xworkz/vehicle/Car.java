package com.xworkz.vehicle;

public class Car extends Vehicle {
    private final int fuelLevel;

    public Car(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = fuelLevel;
        System.out.println("Car Constructor: " + brand + " created.");
    }

    public void openSunroof() {
        System.out.println(brand + " opened the sunroof.");
    }

    public void playMusic() {
        System.out.println(brand + " is playing music.");
    }

    public void checkFuel() {
        System.out.println(brand + " has " + fuelLevel + "% fuel left.");
    }

    public void enableCruiseControl() {
        System.out.println(brand + " cruise control activated.");
    }
}
