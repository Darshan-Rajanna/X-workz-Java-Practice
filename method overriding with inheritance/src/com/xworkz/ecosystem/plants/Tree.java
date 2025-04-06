package com.xworkz.ecosystem.plants;

import com.xworkz.ecosystem.organisms.Plant;

public class Tree extends Plant {

    public Tree(String name, String habitat) {
        super(name, habitat);
    }

    // Overriding Organism methods
    @Override
    public void grow() {
        System.out.println(name + " grows tall with a thick trunk and spreading branches.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " reproduces through seeds found in fruits or cones.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " absorbs water and nutrients from the soil through its deep roots.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " responds to seasonal changes, gravity, and light direction.");
    }

    @Override
    public void respire() {
        System.out.println(name + " respires continuously, especially through leaves and roots.");
    }

    // Overriding Plant methods
    @Override
    public void performPhotosynthesis() {
        System.out.println(name + " performs photosynthesis using chlorophyll in leaves.");
    }

    @Override
    public void transportWaterAndNutrients() {
        System.out.println(name + " uses xylem and phloem tissues to transport water and nutrients.");
    }

    @Override
    public void openAndCloseStomata() {
        System.out.println(name + " controls water loss and gas exchange via stomata.");
    }

    @Override
    public void growTowardsLight() {
        System.out.println(name + " directs its branches and leaves towards sunlight.");
    }

    @Override
    public void shedLeavesSeasonally() {
        System.out.println(name + " sheds its leaves in autumn or dry seasons.");
    }

    // 5 Tree-specific protected methods
    protected void growTall() {
        System.out.println(name + " is growing tall and strong.");
    }

    protected void shedLeaves() {
        System.out.println(name + " sheds leaves in certain seasons.");
    }

    protected void provideOxygen() {
        System.out.println(name + " releases oxygen through photosynthesis.");
    }

    protected void produceFruitsOrSeeds() {
        System.out.println(name + " produces fruits or seeds for reproduction.");
    }

    protected void supportEcosystem() {
        System.out.println(name + " provides shelter and food to various organisms.");
    }
}
