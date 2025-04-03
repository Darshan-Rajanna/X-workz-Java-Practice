package com.xworkz.ecosystem.animals.amphibians;

import com.xworkz.ecosystem.animals.Amphibian;

public class PoisonDartFrog extends Amphibian {
    public PoisonDartFrog() {
        super("Poison Dart Frog", "Tropical rainforests");
    }

    public void toxicSkin() {
        System.out.println(name + " has brightly colored, toxic skin to deter predators.");
    }
}
