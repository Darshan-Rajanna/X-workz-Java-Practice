package com.xworkz.ecosystem.plants;

import com.xworkz.ecosystem.organisms.Plant;

public class FloweringPlant extends Plant {
    public FloweringPlant(String name, String habitat) {
        super(name, habitat);
    }

    public void produceFlowers() {
        System.out.println(name + " produces flowers for reproduction.");
    }

    public void attractPollinators() {
        System.out.println(name + " attracts bees, butterflies, and birds for pollination.");
    }

    public void produceFruits() {
        System.out.println(name + " produces fruits that contain seeds.");
    }

    public void contributeToBiodiversity() {
        System.out.println(name + " supports biodiversity by providing nectar and habitat.");
    }

    public void usedForMedicinalPurposes() {
        System.out.println(name + " is used in medicine and herbal remedies.");
    }
}

