package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Hippopotamus extends Mammal {

    public Hippopotamus(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " gives birth in water.");
    }

    @Override
    public void produceMilk() {
        System.out.println(name + " nurses young both underwater and on land.");
    }

    @Override
    public void regulateBodyTemperature() {
        System.out.println(name + " stays in water to cool its body.");
    }

    @Override
    public void haveHairOrFur() {
        System.out.println(name + " has very little hair on its body.");
    }

    @Override
    public void breatheAir() {
        System.out.println(name + " breathes air through nostrils positioned on top of the snout.");
    }
}
