package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Rhinoceros extends Mammal {
    public Rhinoceros() {
        super("Rhinoceros", "Grasslands and savannas");
    }

    public void useHorn() {
        System.out.println(name + " uses its horn for defense and dominance.");
    }

    public void thickSkin() {
        System.out.println(name + " has a thick, armor-like skin for protection.");
    }
}
