package com.xworkz.ecosystem.plants.aquatic;

import com.xworkz.ecosystem.plants.AquaticPlant;

public class Seagrass extends AquaticPlant {

    public Seagrass() {
        super("Seagrass", "Shallow marine environments");
    }

    @Override
    public void floatOnWater() {
        System.out.println(name + " grows anchored in seabeds but its leaves may float to access sunlight.");
    }

    @Override
    public void absorbNutrientsFromWater() {
        System.out.println(name + " absorbs nutrients from both seawater and sediment using roots and leaves.");
    }

    @Override
    public void provideHabitatForAquaticLife() {
        System.out.println(name + " forms underwater meadows that shelter fish, crustaceans, and mollusks.");
    }

    @Override
    public void helpOxygenateWater() {
        System.out.println(name + " releases oxygen into the surrounding seawater via photosynthesis.");
    }

    @Override
    public void controlAlgaeGrowth() {
        System.out.println(name + " competes with algae for nutrients and light, limiting algal blooms.");
    }
}
