package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Orchid extends FloweringPlant {
    public Orchid() {
        super("Orchid", "Tropical forests and greenhouses");
    }

    @Override
    public void produceFlowers() {
        System.out.println(name + " produces intricate and exotic-looking flowers.");
    }

    @Override
    public void attractPollinators() {
        System.out.println(name + " attracts specific pollinators with specialized shapes and scents.");
    }

    @Override
    public void produceFruits() {
        System.out.println(name + " produces capsules with numerous tiny seeds.");
    }

    @Override
    public void contributeToBiodiversity() {
        System.out.println(name + " promotes genetic diversity and unique ecosystems.");
    }

    @Override
    public void usedForMedicinalPurposes() {
        System.out.println(name + " is used in perfumes and some traditional medicine.");
    }
}
