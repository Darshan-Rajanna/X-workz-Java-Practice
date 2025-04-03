package com.xworkz.vehicle;

public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String brand, int speed, int loadCapacity) {
        super(brand, speed);
        this.loadCapacity = loadCapacity;
        System.out.println("Truck Constructor: " + brand + " created.");
    }

    public void loadCargo(int weight) {
        System.out.println(brand + " loaded " + weight + " kg of cargo.");
    }

    public void unloadCargo() {
        System.out.println(brand + " unloaded all cargo.");
    }

    public void checkLoadCapacity() {
        System.out.println(brand + " has a load capacity of " + loadCapacity + " kg.");
    }

    public void activateTrailerMode() {
        System.out.println(brand + " trailer mode activated.");
    }
}
