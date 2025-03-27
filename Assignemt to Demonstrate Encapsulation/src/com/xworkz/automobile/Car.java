package com.xworkz.automobile;

import javax.print.attribute.standard.MediaSize;

public class Car {
    //control the access
//    private String brand;
//    private String model;
//    private int speed;
//    private boolean isEngineOn;
//    private Engine engine;
//    private FuelTank fuelTank;
//
//    public Car(String brand, String model, int speed, Engine engine, FuelTank fuelTank){
//        this.brand=brand;
//        this.model=model;
//        this.speed=speed;
//        this.isEngineOn=false;
//        this.engine=engine;
//        this.fuelTank=fuelTank;
//    }
//    public Car(){
//        this.brand="Unknown";
//        this.model="Unknown";
//        this.speed=0;
//        this.isEngineOn=false;
//        this.engine=new Engine();
//        this.fuelTank=new FuelTank();
//    }
//    public void setBrand(String brand){
//        this.brand=brand;
//    }
//    public void setModel(String model){
//        this.model=model;
//    }
//    private void setSpeed(int speed){
//        if(isEngineOn){
//            this.speed=speed;
//        }
//        else System.out.println("Start Engine");
//    }
//    void accelerate(int increment){
//        if (isEngineOn){
//            this.speed+=increment;
//            System.out.println("the car speed incremented and new speed is : "+speed);
//        }
//        else System.out.println("Engine is off");
//    }
//    public void startEngine(){
//        if(fuelTank.hasFuel()){
//            this.isEngineOn=true;
//            System.out.println("The Engine started");
//        }
//        else{
//            System.out.println("The Fuel Tank is Empty");
//        }
    }
}
