package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Daffodil extends FloweringPlant {
    public Daffodil() {
        super("Daffodil", "Woodlands, gardens, temperate climates");
    }

    @Override
    public void produceFlowers() {
        System.out.println(name + " produces bright yellow flowers during the spring season.");
    }

    @Override
    public void attractPollinators() {
        System.out.println(name + " attracts bees and insects for pollination with its fragrance and color.");
    }

    @Override
    public void produceFruits() {
        System.out.println(name + " forms seed-containing capsules after pollination.");
    }

    @Override
    public void contributeToBiodiversity() {
        System.out.println(name + " supports pollinators and enriches local biodiversity.");
    }

    @Override
    public void usedForMedicinalPurposes() {
        System.out.println(name + " has compounds studied for medical treatments but must be used with caution.");
    }
}
