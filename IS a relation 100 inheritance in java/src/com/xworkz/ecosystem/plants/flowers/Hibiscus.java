package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Hibiscus extends FloweringPlant {
    public Hibiscus() {
        super("Hibiscus", "Tropical and subtropical regions");
    }

    public void medicinalProperties() {
        System.out.println(name + " is used in herbal medicines and hair care.");
    }

    public void attractPollinators() {
        System.out.println(name + " attracts bees and butterflies for pollination.");
    }
}
