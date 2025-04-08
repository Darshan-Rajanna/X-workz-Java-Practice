package com.xworkz.ecosystem.plants;

import com.xworkz.ecosystem.organisms.Plant;

public class FloweringPlant extends Plant {

    public FloweringPlant(String name, String habitat) {
        super(name, habitat);
    }

    // Overriding Organism methods
    @Override
    public void grow() {
        System.out.println(name + " grows through stages from seedling to mature plant with flowers.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " reproduces sexually through the formation of seeds in flowers.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " absorbs water and nutrients from soil through roots.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " responds to light, gravity, and touch by altering growth.");
    }

    @Override
    public void respire() {
        System.out.println(name + " respires by exchanging gases through stomata in leaves.");
    }

    // Overriding Plant methods
    @Override
    public void performPhotosynthesis() {
        System.out.println(name + " performs photosynthesis using chloroplasts in leaves.");
    }

    @Override
    public void transportWaterAndNutrients() {
        System.out.println(name + " uses xylem and phloem to transport water and nutrients.");
    }

    @Override
    public void openAndCloseStomata() {
        System.out.println(name + " opens and closes stomata to regulate gas exchange.");
    }

    @Override
    public void growTowardsLight() {
        System.out.println(name + " exhibits phototropism by growing towards sunlight.");
    }

    @Override
    public void shedLeavesSeasonally() {
        System.out.println(name + " sheds leaves in response to seasonal changes to conserve water.");
    }

    // 5 FloweringPlant-specific protected methods
    protected void produceFlowers() {
        System.out.println(name + " produces flowers for reproduction.");
    }

    protected void attractPollinators() {
        System.out.println(name + " attracts bees, butterflies, and birds for pollination.");
    }

    protected void produceFruits() {
        System.out.println(name + " produces fruits that contain seeds.");
    }

    protected void contributeToBiodiversity() {
        System.out.println(name + " supports biodiversity by providing nectar and habitat.");
    }

    protected void usedForMedicinalPurposes() {
        System.out.println(name + " is used in medicine and herbal remedies.");
    }
}
