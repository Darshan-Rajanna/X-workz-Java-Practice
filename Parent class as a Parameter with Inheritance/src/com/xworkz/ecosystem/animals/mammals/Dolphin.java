package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Dolphin extends Mammal {

    public Dolphin(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " gives birth in water to live young.");
    }

    @Override
    public void produceMilk() {
        System.out.println(name + " feeds milk to its calf underwater.");
    }

    @Override
    public void regulateBodyTemperature() {
        System.out.println(name + " maintains warm blood temperature in aquatic environments.");
    }

    @Override
    public void haveHairOrFur() {
        System.out.println(name + " has hair at birth, which disappears later.");
    }

    @Override
    public void breatheAir() {
        System.out.println(name + " breathes through a blowhole on top of its head.");
    }
}
