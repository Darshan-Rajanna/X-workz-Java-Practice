package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Sunflower extends FloweringPlant {
    public Sunflower() {
        super("Sunflower", "Fields and sunny open areas");
    }

    @Override
    public void produceFlowers() {
        System.out.println(name + " produces large yellow flowers that follow the sun.");
    }

    @Override
    public void attractPollinators() {
        System.out.println(name + " attracts bees and helps pollinate nearby crops.");
    }

    @Override
    public void produceFruits() {
        System.out.println(name + " produces seeds that are rich in oil.");
    }

    @Override
    public void contributeToBiodiversity() {
        System.out.println(name + " supports pollinators and birds.");
    }

    @Override
    public void usedForMedicinalPurposes() {
        System.out.println(name + " seeds and oil are used in food and wellness.");
    }
}
