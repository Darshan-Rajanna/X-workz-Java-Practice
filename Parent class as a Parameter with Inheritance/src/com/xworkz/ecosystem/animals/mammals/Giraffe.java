package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Giraffe extends Mammal {

    public Giraffe(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " gives birth standing up; the calf drops to the ground.");
    }

    @Override
    public void produceMilk() {
        System.out.println(name + " feeds calves with milk while protecting them from predators.");
    }

    @Override
    public void regulateBodyTemperature() {
        System.out.println(name + " uses its long neck for thermoregulation.");
    }

    @Override
    public void haveHairOrFur() {
        System.out.println(name + " has spotted fur for camouflage.");
    }

    @Override
    public void breatheAir() {
        System.out.println(name + " breathes through long air passages in its neck.");
    }
}
