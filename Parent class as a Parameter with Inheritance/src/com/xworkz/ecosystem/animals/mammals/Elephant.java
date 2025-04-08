package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Elephant extends Mammal {

    public Elephant(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " gives birth after a long gestation period of nearly 22 months.");
    }

    @Override
    public void produceMilk() {
        System.out.println(name + " feeds milk to calves using mammary glands between front legs.");
    }

    @Override
    public void regulateBodyTemperature() {
        System.out.println(name + " regulates temperature using its large ears.");
    }

    @Override
    public void haveHairOrFur() {
        System.out.println(name + " has sparse body hair.");
    }

    @Override
    public void breatheAir() {
        System.out.println(name + " breathes through its trunk and mouth.");
    }
}
