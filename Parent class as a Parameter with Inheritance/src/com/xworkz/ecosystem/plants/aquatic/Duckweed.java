package com.xworkz.ecosystem.plants.aquatic;

import com.xworkz.ecosystem.plants.AquaticPlant;

public class Duckweed extends AquaticPlant {

    public Duckweed() {
        super("Duckweed", "Still or slow-moving freshwater bodies");
    }

    // Overriding protected methods of AquaticPlant and making them public
    @Override
    public void floatOnWater() {
        System.out.println(name + " floats on water using air-filled structures and forms clusters.");
    }

    @Override
    public void absorbNutrientsFromWater() {
        System.out.println(name + " efficiently absorbs dissolved nutrients directly from the water.");
    }

    @Override
    public void provideHabitatForAquaticLife() {
        System.out.println(name + " offers cover and microhabitats for small aquatic creatures.");
    }

    @Override
    public void helpOxygenateWater() {
        System.out.println(name + " contributes to oxygenation through photosynthesis during the day.");
    }

    @Override
    public void controlAlgaeGrowth() {
        System.out.println(name + " helps reduce algae by blocking sunlight and using up nutrients.");
    }
}
