package com.xworkz.ecosystem.plants.aquatic;

import com.xworkz.ecosystem.plants.AquaticPlant;

public class Hornwort extends AquaticPlant {
    public Hornwort() {
        super("Hornwort", "Freshwater lakes, ponds, and aquariums");
    }

    public void oxygenateWater() {
        System.out.println(name + " releases oxygen into the water, benefiting aquatic life.");
    }

    public void preventAlgaeGrowth() {
        System.out.println(name + " competes with algae and prevents its excessive growth.");
    }
}
