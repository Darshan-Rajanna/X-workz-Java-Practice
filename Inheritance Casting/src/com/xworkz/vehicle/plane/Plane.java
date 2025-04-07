package com.xworkz.vehicle.plane;
import com.xworkz.vehicle.Vehicle;

public class Plane extends Vehicle{
    public Plane(){
        super("Sky", 3);
        System.out.println("this is an Plane no argument constructor");
    }

    @Override
    public void modeofTrans(){
        System.out.println("Vehicle is overridden in Plane");
    }

    @Override
    public void noOfTyres(){
        System.out.println("Vehicle is overridden in Plane");
    }
    public void details(Vehicle vehicle){
        if(vehicle!=null){
            System.out.println("this is an details methods in Plane");
            vehicle.publicclass();
        }
        else System.out.println("passed argument is null please check");
    }

    public void subclassMethod(){
        System.out.println("Vehicle subclass Plane's public method");
    }

}
