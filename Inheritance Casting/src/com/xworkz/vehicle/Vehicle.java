package com.xworkz.vehicle;

public class Vehicle {
    private String type;
    private int noOfTyres;

    protected Vehicle(String type, int noOfTyres){
        this.type=type;
        this.noOfTyres=noOfTyres;
        System.out.println("This is an Vehicle class constructor");
    }

    protected void modeofTrans(){
        System.out.println(type+"is a mode of Transport");
    }

    protected void noOfTyres(){
        System.out.println(noOfTyres+" these are the number of tyres of the vehicle");
    }

    public void publicclass(){
        System.out.println("Vehicle class : Public method");
    }

    private void privateclass(){
        System.out.println("Vehicle class: Private method");
    }
}
