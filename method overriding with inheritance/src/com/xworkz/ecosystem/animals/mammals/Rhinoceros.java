package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Rhinoceros extends Mammal {

    public Rhinoceros(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " gives birth to one calf after long gestation.");
    }

    @Override
    public void produceMilk() {
        System.out.println(name + " feeds milk to its calf and guards it closely.");
    }

    @Override
    public void regulateBodyTemperature() {
        System.out.println(name + " wallows in mud to cool down.");
    }

    @Override
    public void haveHairOrFur() {
        System.out.println(name + " has minimal hair but thick skin.");
    }

    @Override
    public void breatheAir() {
        System.out.println(name + " breathes air through nostrils on the snout.");
    }
}
