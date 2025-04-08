package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Badger extends Mammal {

    public Badger(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " gives birth in underground burrows and protects its young.");
    }

    @Override
    public void produceMilk() {
        System.out.println(name + " produces milk to nurse its cubs.");
    }

    @Override
    public void regulateBodyTemperature() {
        System.out.println(name + " regulates body temperature efficiently even in cold regions.");
    }

    @Override
    public void haveHairOrFur() {
        System.out.println(name + " has coarse fur for warmth and camouflage.");
    }

    @Override
    public void breatheAir() {
        System.out.println(name + " breathes air using well-developed lungs.");
    }
}
