package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Lion extends Mammal {

    public Lion(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " gives birth to cubs and raises them in dens.");
    }

    @Override
    public void produceMilk() {
        System.out.println(name + " feeds cubs with milk until they can hunt.");
    }

    @Override
    public void regulateBodyTemperature() {
        System.out.println(name + " maintains body temperature in savannas.");
    }

    @Override
    public void haveHairOrFur() {
        System.out.println(name + " has a short coat and the males have a mane.");
    }

    @Override
    public void breatheAir() {
        System.out.println(name + " breathes through powerful lungs.");
    }
}
