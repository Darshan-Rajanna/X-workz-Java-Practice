package com.xworkz.ecosystem.interfaces;

public interface Bird {
    default void fly(){
        System.out.println("default Bird");
    };
    void layEggs();
    void buildNest();
}