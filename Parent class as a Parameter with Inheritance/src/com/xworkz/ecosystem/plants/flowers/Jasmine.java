package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Jasmine extends FloweringPlant {
    public Jasmine() {
        super("Jasmine", "Warm temperate and tropical regions");
    }

    @Override
    public void produceFlowers() {
        System.out.println(name + " produces small, fragrant white or yellow flowers.");
    }

    @Override
    public void attractPollinators() {
        System.out.println(name + " attracts moths and bees with its strong scent.");
    }

    @Override
    public void produceFruits() {
        System.out.println(name + " produces small berries as fruit.");
    }

    @Override
    public void contributeToBiodiversity() {
        System.out.println(name + " enhances the floral diversity of garden ecosystems.");
    }

    @Override
    public void usedForMedicinalPurposes() {
        System.out.println(name + " is used in aromatherapy and skincare products.");
    }
}
