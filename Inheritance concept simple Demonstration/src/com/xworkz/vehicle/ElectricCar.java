package com.xworkz.vehicle;

public class ElectricCar extends Car {
    private int batteryPercentage;

    public ElectricCar(String brand, int speed, int fuelLevel, int batteryPercentage) {
        super(brand, speed, fuelLevel);
        this.batteryPercentage = batteryPercentage;
        System.out.println("ElectricCar Constructor: " + brand + " created.");
    }

    public void chargeBattery(int amount) {
        batteryPercentage += amount;
        if (batteryPercentage > 100) batteryPercentage = 100;
        System.out.println(brand + " battery charged to " + batteryPercentage + "%.");
    }

    public void enableAutopilot() {
        System.out.println(brand + " autopilot activated.");
    }

    public void showBatteryStatus() {
        System.out.println(brand + " has " + batteryPercentage + "% battery left.");
    }

    public void regenBraking() {
        System.out.println(brand + " is regenerating energy while braking.");
    }
}

