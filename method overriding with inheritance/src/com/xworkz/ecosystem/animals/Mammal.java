package com.xworkz.ecosystem.animals;

import com.xworkz.ecosystem.organisms.Animal;

public class Mammal extends Animal {
    public Mammal(String name, String habitat) {
        super(name, habitat);
    }

    public void giveBirth() {
        System.out.println(name + " gives birth to live young.");
    }

    public void produceMilk() {
        System.out.println(name + " produces milk to feed its young.");
    }

    public void regulateBodyTemperature() {
        System.out.println(name + " maintains a constant body temperature.");
    }

    public void haveHairOrFur() {
        System.out.println(name + " has hair or fur covering its body.");
    }

    public void breatheAir() {
        System.out.println(name + " breathes air through lungs.");
    }
}

