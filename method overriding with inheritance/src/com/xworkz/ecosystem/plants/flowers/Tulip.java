package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Tulip extends FloweringPlant {
    public Tulip() {
        super("Tulip", "Temperate regions and gardens");
    }

    @Override
    public void produceFlowers() {
        System.out.println(name + " produces cup-shaped vibrant flowers in spring.");
    }

    @Override
    public void attractPollinators() {
        System.out.println(name + " attracts bees and other insects during bloom.");
    }

    @Override
    public void produceFruits() {
        System.out.println(name + " produces capsules with many small seeds.");
    }

    @Override
    public void contributeToBiodiversity() {
        System.out.println(name + " enriches spring floral diversity in temperate gardens.");
    }

    @Override
    public void usedForMedicinalPurposes() {
        System.out.println(name + " has limited use in folk medicine.");
    }
}
