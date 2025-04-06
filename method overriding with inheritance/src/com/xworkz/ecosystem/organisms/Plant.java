package com.xworkz.ecosystem.organisms;

public class Plant extends Organism {

    public Plant(String name, String habitat) {
        super(name, habitat, true, "Sexual/Asexual", "Autotrophic");
    }

    @Override
    public void grow() {
        System.out.println(name + " the plant is growing through cell division and elongation.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " reproduces sexually or asexually through seeds or spores.");
    }

    @Override
    public void respire() {
        System.out.println(name + " respires aerobically using oxygen for cellular respiration.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " responds to light, gravity, touch, and water.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " synthesizes its own food using sunlight, carbon dioxide, and water.");
    }

    // Additional behaviors unique to Plant class
    protected void performPhotosynthesis() {
        System.out.println(name + " is performing photosynthesis using chlorophyll.");
    }

    protected void transportWaterAndNutrients() {
        System.out.println(name + " is transporting water and nutrients through xylem and phloem.");
    }

    protected void openAndCloseStomata() {
        System.out.println(name + " is regulating gas exchange by opening and closing stomata.");
    }

    protected void growTowardsLight() {
        System.out.println(name + " is growing towards light through phototropism.");
    }

    protected void shedLeavesSeasonally() {
        System.out.println(name + " is shedding its leaves during dry or cold seasons.");
    }
}
