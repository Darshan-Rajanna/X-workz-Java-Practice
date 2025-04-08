package com.xworkz.ecosystem.plants;

import com.xworkz.ecosystem.organisms.Plant;

public class Grass extends Plant {

    public Grass(String name, String habitat) {
        super(name, habitat);
    }

    // Overriding Organism methods
    @Override
    public void grow() {
        System.out.println(name + " grows rapidly through tillering and underground rhizomes.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " reproduces through seeds and vegetative propagation.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " absorbs nutrients and water from the soil through fibrous roots.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " bends towards light and adjusts growth to grazing pressure.");
    }

    @Override
    public void respire() {
        System.out.println(name + " respires by exchanging gases through its leaves.");
    }

    // Overriding Plant methods
    @Override
    public void performPhotosynthesis() {
        System.out.println(name + " uses sunlight to convert carbon dioxide and water into glucose.");
    }

    @Override
    public void transportWaterAndNutrients() {
        System.out.println(name + " transports water and nutrients through vascular tissues.");
    }

    @Override
    public void openAndCloseStomata() {
        System.out.println(name + " regulates water loss and gas exchange by opening and closing stomata.");
    }

    @Override
    public void growTowardsLight() {
        System.out.println(name + " grows in the direction of sunlight to optimize photosynthesis.");
    }

    @Override
    public void shedLeavesSeasonally() {
        System.out.println(name + " may shed older blades to conserve energy and promote new growth.");
    }

    // 5 Grass-specific protected methods
    protected void growRapidly() {
        System.out.println(name + " grows quickly and spreads over large areas.");
    }

    protected void provideFoodForHerbivores() {
        System.out.println(name + " is a primary food source for many herbivores.");
    }

    protected void preventSoilErosion() {
        System.out.println(name + " holds the soil together with its roots.");
    }

    protected void withstandFrequentGrazing() {
        System.out.println(name + " can regrow quickly after being grazed upon.");
    }

    protected void contributeToOxygenProduction() {
        System.out.println(name + " contributes to oxygen production and air purification.");
    }
}
