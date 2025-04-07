package com.xworkz.vehicle.car;
import com.xworkz.vehicle.Vehicle;

import java.util.SortedMap;

public class Car extends Vehicle{
    public Car(){
        super("Land", 4);
        System.out.println("this is an Car no argument constructor");
    }

    @Override
    public void modeofTrans(){
        System.out.println("Vehicle is overriden in Car");
    }

    @Override
    public void noOfTyres(){
        System.out.println("Vehicle is overridden in Car");
    }
    public void details(Vehicle vehicle){
        if (vehicle!=null) {
            System.out.println("this is an details methods in Car");
            vehicle.publicclass();
        }
        else System.out.println("argument passed is null please check again");
    }

    public void subclassMethod(){
        System.out.println("Vehicle subclass Car's public method");
    }
}
