package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Daisy extends FloweringPlant {
    public Daisy() {
        super("Daisy", "Meadows, gardens, grasslands");
    }

    @Override
    public void produceFlowers() {
        System.out.println(name + " produces white petals with yellow centers.");
    }

    @Override
    public void attractPollinators() {
        System.out.println(name + " attracts bees and butterflies with its bright colors and nectar.");
    }

    @Override
    public void produceFruits() {
        System.out.println(name + " produces dry fruit called a cypsela.");
    }

    @Override
    public void contributeToBiodiversity() {
        System.out.println(name + " supports various pollinators and stabilizes ecosystems.");
    }

    @Override
    public void usedForMedicinalPurposes() {
        System.out.println(name + " is used in herbal remedies for anti-inflammatory and calming effects.");
    }
}
