package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Bear extends Mammal {

    public Bear(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " gives birth during hibernation in dens.");
    }

    @Override
    public void produceMilk() {
        System.out.println(name + " nurses cubs with nutrient-rich milk.");
    }

    @Override
    public void regulateBodyTemperature() {
        System.out.println(name + " maintains temperature even in cold climates.");
    }

    @Override
    public void haveHairOrFur() {
        System.out.println(name + " has thick fur for insulation.");
    }

    @Override
    public void breatheAir() {
        System.out.println(name + " breathes through lungs and can hold breath underwater briefly.");
    }
}
