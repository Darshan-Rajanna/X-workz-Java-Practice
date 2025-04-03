package com.xworkz.ecosystem.plants;

import com.xworkz.ecosystem.organisms.Plant;

public class Grass extends Plant {
    public Grass(String name, String habitat) {
        super(name, habitat);
    }

    public void growRapidly() {
        System.out.println(name + " grows quickly and spreads over large areas.");
    }

    public void provideFoodForHerbivores() {
        System.out.println(name + " is a primary food source for many herbivores.");
    }

    public void preventSoilErosion() {
        System.out.println(name + " holds the soil together with its roots.");
    }

    public void withstandFrequentGrazing() {
        System.out.println(name + " can regrow quickly after being grazed upon.");
    }

    public void contributeToOxygenProduction() {
        System.out.println(name + " contributes to oxygen production and air purification.");
    }
}

