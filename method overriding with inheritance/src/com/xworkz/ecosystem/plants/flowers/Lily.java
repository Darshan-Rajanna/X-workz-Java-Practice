package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Lily extends FloweringPlant {
    public Lily() {
        super("Lily", "Temperate forests and gardens");
    }

    @Override
    public void produceFlowers() {
        System.out.println(name + " produces large, showy, and often fragrant flowers.");
    }

    @Override
    public void attractPollinators() {
        System.out.println(name + " attracts bees and beetles with scent and color.");
    }

    @Override
    public void produceFruits() {
        System.out.println(name + " produces capsules that contain flat seeds.");
    }

    @Override
    public void contributeToBiodiversity() {
        System.out.println(name + " contributes to floral diversity in woodlands.");
    }

    @Override
    public void usedForMedicinalPurposes() {
        System.out.println(name + " is used in traditional medicine for its anti-inflammatory properties.");
    }
}
