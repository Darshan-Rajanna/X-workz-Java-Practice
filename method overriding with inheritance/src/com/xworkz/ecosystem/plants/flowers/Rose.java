package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Rose extends FloweringPlant {
    public Rose() {
        super("Rose", "Gardens and temperate regions");
    }

    @Override
    public void produceFlowers() {
        System.out.println(name + " produces layered, fragrant flowers in various colors.");
    }

    @Override
    public void attractPollinators() {
        System.out.println(name + " attracts bees and butterflies with scent and color.");
    }

    @Override
    public void produceFruits() {
        System.out.println(name + " produces rose hips that contain seeds.");
    }

    @Override
    public void contributeToBiodiversity() {
        System.out.println(name + " supports pollinators and adds beauty to ecosystems.");
    }

    @Override
    public void usedForMedicinalPurposes() {
        System.out.println(name + " is used in skincare, perfumes, and herbal teas.");
    }
}
