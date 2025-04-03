package com.xworkz.ecosystem.plants;

import com.xworkz.ecosystem.organisms.Plant;

public class Cactus extends Plant {
    public Cactus(String name, String habitat) {
        super(name, habitat);
    }

    public void storeWater() {
        System.out.println(name + " stores water in its thick stems to survive dry climates.");
    }

    public void haveSpinesInsteadOfLeaves() {
        System.out.println(name + " has spines instead of leaves to reduce water loss.");
    }

    public void performCAMPhotosynthesis() {
        System.out.println(name + " performs CAM photosynthesis to conserve water.");
    }

    public void surviveInHarshConditions() {
        System.out.println(name + " is highly adapted to survive in extreme temperatures.");
    }

    public void provideFoodAndMedicine() {
        System.out.println(name + " is used for food, medicine, and water in deserts.");
    }
}
