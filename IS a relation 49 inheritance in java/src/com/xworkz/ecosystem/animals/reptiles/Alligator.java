package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class Alligator extends Reptile {
    public Alligator() {
        super("Alligator", "Swamps, rivers, and lakes");
    }

    public void powerfulBite() {
        System.out.println(name + " has one of the most powerful bites in the animal kingdom.");
    }

    public void ambushPredator() {
        System.out.println(name + " waits motionless in water to ambush prey.");
    }
}
