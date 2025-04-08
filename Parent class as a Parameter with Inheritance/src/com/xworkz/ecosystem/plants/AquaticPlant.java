package com.xworkz.ecosystem.plants;

import com.xworkz.ecosystem.organisms.Plant;

public class AquaticPlant extends Plant {

    public AquaticPlant(String name, String habitat) {
        super(name, habitat);
    }

    // Overriding Organism methods
    @Override
    public void grow() {
        System.out.println(name + " grows by adapting to aquatic conditions and elongating its stem and leaves.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " reproduces via water-dispersed seeds or fragmentation.");
    }

    @Override
    public void respire() {
        System.out.println(name + " respires aerobically and may use surface structures for gas exchange.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " responds to light direction, water flow, and nutrient levels.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " absorbs minerals and nutrients directly from the surrounding water.");
    }

    // Overriding Plant methods
    @Override
    public void performPhotosynthesis() {
        System.out.println(name + " performs photosynthesis while submerged or floating, using chlorophyll.");
    }

    @Override
    public void transportWaterAndNutrients() {
        System.out.println(name + " uses vascular tissues adapted for water transport in aquatic environments.");
    }

    @Override
    public void openAndCloseStomata() {
        System.out.println(name + " regulates gas exchange with limited or modified stomata.");
    }

    @Override
    public void growTowardsLight() {
        System.out.println(name + " grows towards sunlight filtered through water (positive phototropism).");
    }

    @Override
    public void shedLeavesSeasonally() {
        System.out.println(name + " sheds older or submerged leaves as part of adaptation to water movement.");
    }

    // 5 New AquaticPlant-specific protected methods
    protected void floatOnWater() {
        System.out.println(name + " floats on the water surface using air sacs or spongy tissues.");
    }

    protected void absorbNutrientsFromWater() {
        System.out.println(name + " anchors to the muddy soil below water using roots.");
    }

    protected void provideHabitatForAquaticLife() {
        System.out.println(name + " helps filter and clean pollutants from water bodies.");
    }

    protected void helpOxygenateWater() {
        System.out.println(name + " provides a safe environment for fish and amphibians to breed.");
    }

    protected void controlAlgaeGrowth() {
        System.out.println(name + " regulates water temperature by providing shade and oxygenation.");
    }
}
