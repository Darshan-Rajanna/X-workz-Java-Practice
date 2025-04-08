package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Bat extends Mammal {

    public Bat(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " gives birth while hanging upside down.");
    }

    @Override
    public void produceMilk() {
        System.out.println(name + " produces milk to feed its pups.");
    }

    @Override
    public void regulateBodyTemperature() {
        System.out.println(name + " maintains body temperature and uses torpor during rest.");
    }

    @Override
    public void haveHairOrFur() {
        System.out.println(name + " has thin fur covering its body.");
    }

    @Override
    public void breatheAir() {
        System.out.println(name + " breathes air using lungs even while flying.");
    }
}
