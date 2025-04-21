package com.xworkz.ecosystem.interfaces;

public interface Mammal{
    default void giveBirth(){
        System.out.println("default Mammal");
    };
    void produceMilk();
    void regulateBodyTemperature();

    void aerialInfo();
}