package com.xworkz.main;

import com.xworkz.vehicle.*;

public class Main {
    public static void main(String[] args) {
        // 1. Copy of Parent (Vehicle) and invoking five methods
        System.out.println("\n--- Creating Vehicle Instance ---");
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 40);
        myVehicle.start();
        myVehicle.accelerate(20);
        myVehicle.applyBrakes(10);
        myVehicle.honk();
        myVehicle.stop();

        // 2. Copy of Sub-class (Car) using Parent as Reference Type
        System.out.println("\n--- Creating Car Instance with Vehicle Reference ---");
        Vehicle myCar = new Car("Toyota", 60, 80);
        myCar.start();
        myCar.accelerate(30);
        myCar.applyBrakes(15);
        myCar.honk();
        myCar.stop();
        // Note: Cannot access Car's specific methods like openSunroof() since reference is Vehicle

        // 3. Copy of Sub-class (ElectricCar) using its Own Reference
        System.out.println("\n--- Creating ElectricCar Instance ---");
        ElectricCar myElectricCar = new ElectricCar("Tesla", 70, 50, 90);
        myElectricCar.start();
        myElectricCar.accelerate(40);
        myElectricCar.chargeBattery(10);
        myElectricCar.enableAutopilot();
        myElectricCar.showBatteryStatus();
    }
}
