package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class Iguana extends Reptile {
    public Iguana() {
        super("Iguana", "Rainforests and dry regions");
    }

    public void herbivorousDiet() {
        System.out.println(name + " is a herbivore that mainly eats leaves and fruits.");
    }

    public void tailDefense() {
        System.out.println(name + " uses its long tail to whip predators as a defense mechanism.");
    }
}
