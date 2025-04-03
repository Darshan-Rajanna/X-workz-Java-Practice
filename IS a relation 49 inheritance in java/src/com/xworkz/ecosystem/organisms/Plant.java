package com.xworkz.ecosystem.organisms;

public class Plant extends Organism {
    public Plant(String name, String habitat) {
        super(name, habitat, true, "Sexual/Asexual", "Autotrophic");
    }

    public void photosynthesize() {
        System.out.println(name + " is performing photosynthesis.");
    }

    public void absorbWaterAndNutrients() {
        System.out.println(name + " is absorbing water and nutrients through roots.");
    }

    public void grow() {
        System.out.println(name + " is growing in " + habitat + ".");
    }

    public void reproduceBySeedsOrSpores() {
        System.out.println(name + " is reproducing through seeds or spores.");
    }

    public void respondToStimuli() {
        System.out.println(name + " is responding to light, gravity, and touch.");
    }
}
