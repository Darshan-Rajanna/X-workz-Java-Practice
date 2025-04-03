package com.xworkz.ecosystem.plants.aquatic;

import com.xworkz.ecosystem.plants.AquaticPlant;

public class Duckweed extends AquaticPlant {
    public Duckweed() {
        super("Duckweed", "Still or slow-moving freshwater bodies");
    }

    public void coverPondSurface() {
        System.out.println(name + " forms a green carpet on pond surfaces.");
    }

    public void absorbNutrients() {
        System.out.println(name + " helps in absorbing excess nutrients from the water.");
    }
}
