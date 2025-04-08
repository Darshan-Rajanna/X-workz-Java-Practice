package com.xworkz.ecosystem.plants;

import com.xworkz.ecosystem.organisms.Plant;

public class Fern extends Plant {

    public Fern(String name, String habitat) {
        super(name, habitat);
    }

    // Overriding Organism methods
    @Override
    public void grow() {
        System.out.println(name + " grows gradually through underground rhizomes in moist, shady areas.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " reproduces using spores found on the underside of fronds.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " absorbs nutrients from rich, moist soil using its fibrous roots.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " reacts to humidity, light, and touch by adjusting its frond orientation.");
    }

    @Override
    public void respire() {
        System.out.println(name + " respires through stomata present on its fronds.");
    }

    // Overriding Plant methods
    @Override
    public void performPhotosynthesis() {
        System.out.println(name + " performs photosynthesis using chlorophyll in its fronds.");
    }

    @Override
    public void transportWaterAndNutrients() {
        System.out.println(name + " uses vascular tissues to transport water and nutrients.");
    }

    @Override
    public void openAndCloseStomata() {
        System.out.println(name + " regulates gas exchange by opening and closing stomata.");
    }

    @Override
    public void growTowardsLight() {
        System.out.println(name + " adjusts its frond direction to capture optimal light.");
    }

    @Override
    public void shedLeavesSeasonally() {
        System.out.println(name + " may shed fronds in dry or cold seasons to conserve resources.");
    }

    // 5 Fern-specific protected methods
    protected void reproduceBySpores() {
        System.out.println(name + " reproduces through spores instead of seeds.");
    }

    protected void thriveInShade() {
        System.out.println(name + " grows well in shaded, moist environments.");
    }

    protected void haveFronds() {
        System.out.println(name + " has delicate, divided fronds instead of broad leaves.");
    }

    protected void absorbMoistureFromEnvironment() {
        System.out.println(name + " absorbs moisture directly from the air and soil.");
    }

    protected void preventSoilErosionWithRoots() {
        System.out.println(name + " prevents soil erosion by holding soil with its fibrous roots.");
    }
}
