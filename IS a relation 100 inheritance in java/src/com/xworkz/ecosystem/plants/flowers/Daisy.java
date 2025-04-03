package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Daisy extends FloweringPlant {
    public Daisy() {
        super("Daisy", "Meadows, gardens, grasslands");
    }

    public void bloomInSunlight() {
        System.out.println(name + " blooms in full sunlight.");
    }

    public void spreadEasily() {
        System.out.println(name + " spreads easily through seeds.");
    }
}
