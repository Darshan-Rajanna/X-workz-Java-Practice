package com.xworkz.ecosystem.interfaces;

public interface Plant {
    default void photosynthesize(){
        System.out.println("default Plant");
    };
    void convertSunlightToEnergy();
    void produceOxygen();
}
