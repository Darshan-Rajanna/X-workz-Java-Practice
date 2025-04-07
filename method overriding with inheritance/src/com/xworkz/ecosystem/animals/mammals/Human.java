package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Human extends Mammal {

    public Human(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " gives birth to live babies in hospitals or homes.");
    }

    @Override
    public void produceMilk() {
        System.out.println(name + " uses mammary glands to nourish infants.");
    }

    @Override
    public void regulateBodyTemperature() {
        System.out.println(name + " maintains constant body temperature using sweat and clothing.");
    }

    @Override
    public void haveHairOrFur() {
        System.out.println(name + " has hair on various parts of the body.");
    }

    @Override
    public void breatheAir() {
        System.out.println(name + " breathes air using lungs and diaphragm.");
    }
}
