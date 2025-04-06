package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Lotus extends FloweringPlant {
    public Lotus() {
        super("Lotus", "Freshwater ponds and lakes");
    }

    @Override
    public void produceFlowers() {
        System.out.println(name + " produces large, pink or white floating flowers.");
    }

    @Override
    public void attractPollinators() {
        System.out.println(name + " attracts bees and beetles.");
    }

    @Override
    public void produceFruits() {
        System.out.println(name + " produces spongy pods containing seeds.");
    }

    @Override
    public void contributeToBiodiversity() {
        System.out.println(name + " supports aquatic biodiversity and improves habitat structure.");
    }

    @Override
    public void usedForMedicinalPurposes() {
        System.out.println(name + " is used in Ayurveda and traditional Chinese medicine.");
    }
}
