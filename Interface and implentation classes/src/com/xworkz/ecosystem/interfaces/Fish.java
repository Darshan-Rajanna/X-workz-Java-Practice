package com.xworkz.ecosystem.interfaces;

public interface Fish {
    default void swim(){
        System.out.println("default Fish");
    };
    void breatheUnderwater();
    void layEggsInWater();
}
