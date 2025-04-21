package com.xworkz.ecosystem.interfaces;

public interface FloweringPlant {
    default void produceFlowers(){
        System.out.println("default Flowering plants");
    };
    void produceFruits();
    void attractPollinators();
}
