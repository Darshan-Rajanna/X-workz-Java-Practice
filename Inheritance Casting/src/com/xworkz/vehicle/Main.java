package com.xworkz.vehicle;

import com.xworkz.vehicle.*;
import com.xworkz.vehicle.car.Car;
import com.xworkz.vehicle.plane.Plane;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("Water", 0);

        Car car=new Car();
        Plane plane=new Plane();

        car.modeofTrans();//simple run time poly
        plane.modeofTrans();//simple run time poly
        car.noOfTyres();//simple run time poly
        plane.noOfTyres();//simple run time poly

        car.details(vehicle);
        plane.details(vehicle);

        car.details(plane);//can pass subclass as a parameter
        plane.details(car);//can pass subclass as a parameter

        car.publicclass();//using parent class methods directly
        plane.publicclass();// using parent class methods directly



    }
}