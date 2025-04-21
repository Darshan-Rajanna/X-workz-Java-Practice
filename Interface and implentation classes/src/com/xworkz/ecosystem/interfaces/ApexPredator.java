package com.xworkz.ecosystem.interfaces;

public interface ApexPredator {
    void beTopOfFoodChain();

    void regulatePreyPopulations();

    default void haveNoNaturalPredators(){
        System.out.println("ApexPredator default");
    };
}
