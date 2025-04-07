package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Wolf extends Mammal {

    public Wolf(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " gives birth to pups in a den.");
    }

    @Override
    public void produceMilk() {
        System.out.println(name + " nurses its young until they are ready to hunt.");
    }

    @Override
    public void regulateBodyTemperature() {
        System.out.println(name + " regulates body heat with thick fur.");
    }

    @Override
    public void haveHairOrFur() {
        System.out.println(name + " has dense fur for cold climates.");
    }

    @Override
    public void breatheAir() {
        System.out.println(name + " breathes air using well-developed lungs.");
    }
}
