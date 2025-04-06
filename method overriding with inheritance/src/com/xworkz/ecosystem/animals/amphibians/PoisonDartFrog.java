package com.xworkz.ecosystem.animals.amphibians;

import com.xworkz.ecosystem.animals.Amphibian;

public class PoisonDartFrog extends Amphibian {

    public PoisonDartFrog() {
        super("Poison Dart Frog", "Tropical rainforests");
    }

    @Override
    public void liveInWaterAndLand() {
        System.out.println(name + " mostly stays on land but lays eggs in water or moist environments.");
    }

    @Override
    public void layEggsInWater() {
        System.out.println(name + " lays eggs in small pools or moist leaf litter.");
    }

    @Override
    public void undergoMetamorphosis() {
        System.out.println(name + " tadpoles hatch and transform into adult frogs.");
    }

    @Override
    public void moistSkin() {
        System.out.println(name + " has brightly colored, toxin-secreting moist skin.");
    }

    @Override
    public void coldBlooded() {
        System.out.println(name + " relies on external warmth to regulate body temperature.");
    }
}
