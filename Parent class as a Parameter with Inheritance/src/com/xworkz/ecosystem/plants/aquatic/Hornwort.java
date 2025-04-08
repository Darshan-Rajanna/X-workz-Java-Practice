package com.xworkz.ecosystem.plants.aquatic;

import com.xworkz.ecosystem.plants.AquaticPlant;

public class Hornwort extends AquaticPlant {

    public Hornwort() {
        super("Hornwort", "Freshwater lakes, ponds, and aquariums");
    }

    @Override
    public void floatOnWater() {
        System.out.println(name + " floats freely without roots and helps stabilize aquatic ecosystems.");
    }

    @Override
    public void absorbNutrientsFromWater() {
        System.out.println(name + " absorbs nutrients efficiently through its stems and leaves.");
    }

    @Override
    public void provideHabitatForAquaticLife() {
        System.out.println(name + " offers shelter for fish fry and invertebrates.");
    }

    @Override
    public void helpOxygenateWater() {
        System.out.println(name + " oxygenates water during photosynthesis, improving water quality.");
    }

    @Override
    public void controlAlgaeGrowth() {
        System.out.println(name + " suppresses algae by limiting nutrient availability and light.");
    }
}
