package com.xworkz.ecosystem.plants;

import com.xworkz.ecosystem.organisms.Plant;

public class AquaticPlant extends Plant {
    public AquaticPlant(String name, String habitat) {
        super(name, habitat);
    }

    public void floatOnWater() {
        System.out.println(name + " floats on water using air-filled tissues.");
    }

    public void absorbNutrientsFromWater() {
        System.out.println(name + " absorbs nutrients directly from the water.");
    }

    public void provideHabitatForAquaticLife() {
        System.out.println(name + " provides shelter and food for aquatic organisms.");
    }
    public void helpOxygenateWater() {
        System.out.println(name + " helps oxygenate water, benefiting marine life.");
    }

    public void controlAlgaeGrowth() {
        System.out.println(name + " helps regulate algae growth by competing for nutrients.");
    }
}
