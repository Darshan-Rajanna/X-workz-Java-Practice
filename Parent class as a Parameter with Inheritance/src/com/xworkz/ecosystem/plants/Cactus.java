package com.xworkz.ecosystem.plants;

import com.xworkz.ecosystem.organisms.Plant;

public class Cactus extends Plant {

    public Cactus(String name, String habitat) {
        super(name, habitat);
    }

    // Overriding Organism methods
    @Override
    public void grow() {
        System.out.println(name + " grows slowly with thick stems in arid environments.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " reproduces via seeds or vegetative cuttings.");
    }

    @Override
    public void respire() {
        System.out.println(name + " respires mainly at night to reduce water loss.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " responds to light and water availability in the desert.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " absorbs water and minerals through shallow roots.");
    }

    // Overriding Plant methods
    @Override
    public void performPhotosynthesis() {
        System.out.println(name + " performs photosynthesis using CAM mechanism to conserve moisture.");
    }

    @Override
    public void transportWaterAndNutrients() {
        System.out.println(name + " transports water efficiently through specialized vascular tissues.");
    }

    @Override
    public void openAndCloseStomata() {
        System.out.println(name + " opens stomata at night to prevent water loss.");
    }

    @Override
    public void growTowardsLight() {
        System.out.println(name + " orients itself to maximize exposure to sunlight.");
    }

    @Override
    public void shedLeavesSeasonally() {
        System.out.println(name + " has spines instead of leaves and doesn’t shed seasonally.");
    }

    // 5 New Cactus-specific protected methods
    protected void storeWaterInStems() {
        System.out.println(name + " stores large amounts of water in its thick, fleshy stems.");
    }

    protected void reduceWaterLossWithSpines() {
        System.out.println(name + " reduces transpiration using spines instead of broad leaves.");
    }

    protected void surviveLongPeriodsWithoutRain() {
        System.out.println(name + " can survive long droughts using stored water and slow metabolism.");
    }

    protected void expandRootsQuicklyAfterRain() {
        System.out.println(name + " quickly spreads its roots to absorb as much rainwater as possible.");
    }

    protected void reflectSunlightWithWaxyCoating() {
        System.out.println(name + " reflects sunlight using a waxy coating to prevent overheating.");
    }
}
