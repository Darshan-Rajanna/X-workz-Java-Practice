package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Hibiscus extends FloweringPlant {
    public Hibiscus() {
        super("Hibiscus", "Tropical and subtropical regions");
    }

    @Override
    public void produceFlowers() {
        System.out.println(name + " produces large, colorful trumpet-shaped flowers.");
    }

    @Override
    public void attractPollinators() {
        System.out.println(name + " attracts bees, butterflies, and hummingbirds.");
    }

    @Override
    public void produceFruits() {
        System.out.println(name + " produces capsules containing seeds.");
    }

    @Override
    public void contributeToBiodiversity() {
        System.out.println(name + " supports local pollinators and improves habitat quality.");
    }

    @Override
    public void usedForMedicinalPurposes() {
        System.out.println(name + " is used to make herbal tea and traditional remedies.");
    }
}
