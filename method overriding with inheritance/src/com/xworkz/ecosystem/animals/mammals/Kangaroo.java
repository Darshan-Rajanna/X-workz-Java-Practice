package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Kangaroo extends Mammal {

    public Kangaroo(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " gives birth to underdeveloped joeys which crawl into the pouch.");
    }

    @Override
    public void produceMilk() {
        System.out.println(name + " produces milk with changing nutrients for growing joeys.");
    }

    @Override
    public void regulateBodyTemperature() {
        System.out.println(name + " uses licking and shade to cool down.");
    }

    @Override
    public void haveHairOrFur() {
        System.out.println(name + " has short fur adapted to the climate.");
    }

    @Override
    public void breatheAir() {
        System.out.println(name + " breathes using lungs like other mammals.");
    }
}
