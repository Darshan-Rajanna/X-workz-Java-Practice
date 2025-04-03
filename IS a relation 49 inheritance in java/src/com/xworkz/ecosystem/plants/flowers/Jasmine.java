package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Jasmine extends FloweringPlant {
    public Jasmine() {
        super("Jasmine", "Tropical regions, gardens, courtyards");
    }

    public void emitFragrance() {
        System.out.println(name + " emits a strong and pleasant fragrance, especially at night.");
    }

    public void usedForEssentialOils() {
        System.out.println(name + " is used in perfumes and essential oils.");
    }
}

