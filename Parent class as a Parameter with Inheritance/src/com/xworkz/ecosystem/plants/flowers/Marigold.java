package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Marigold extends FloweringPlant {
    public Marigold() {
        super("Marigold", "Gardens and agricultural fields");
    }

    @Override
    public void produceFlowers() {
        System.out.println(name + " produces bright yellow and orange flowers.");
    }

    @Override
    public void attractPollinators() {
        System.out.println(name + " attracts bees and repels harmful insects.");
    }

    @Override
    public void produceFruits() {
        System.out.println(name + " produces seeds used for propagation.");
    }

    @Override
    public void contributeToBiodiversity() {
        System.out.println(name + " helps manage pests and attract beneficial insects.");
    }

    @Override
    public void usedForMedicinalPurposes() {
        System.out.println(name + " is used for skin healing and anti-inflammatory treatment.");
    }
}
