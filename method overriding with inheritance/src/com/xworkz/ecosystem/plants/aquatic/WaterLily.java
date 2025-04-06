package com.xworkz.ecosystem.plants.aquatic;

import com.xworkz.ecosystem.plants.AquaticPlant;

public class WaterLily extends AquaticPlant {

    public WaterLily() {
        super("Water Lily", "Freshwater ponds and lakes");
    }

    @Override
    public void floatOnWater() {
        System.out.println(name + " floats on the water using broad, air-filled leaves.");
    }

    @Override
    public void absorbNutrientsFromWater() {
        System.out.println(name + " absorbs nutrients through roots anchored in muddy bottoms.");
    }

    @Override
    public void provideHabitatForAquaticLife() {
        System.out.println(name + " provides shade and shelter for fish and aquatic insects.");
    }

    @Override
    public void helpOxygenateWater() {
        System.out.println(name + " produces oxygen through photosynthesis during daylight.");
    }

    @Override
    public void controlAlgaeGrowth() {
        System.out.println(name + " reduces algae growth by blocking sunlight with its large leaves.");
    }
}
