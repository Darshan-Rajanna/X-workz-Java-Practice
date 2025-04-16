package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.FloweringPlant;

public class Cactus implements FloweringPlant {
    public void produceFlowers() {
        System.out.println("Cactus produces showy flowers");
    }
    public void produceFruits() { System.out.println("Cactus produces edible fruits"); }
    public void attractPollinators() { System.out.println("Cactus attracts bats and moths"); }
}
