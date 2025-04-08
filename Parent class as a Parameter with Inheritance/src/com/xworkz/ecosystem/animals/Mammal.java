package com.xworkz.ecosystem.animals;

import com.xworkz.ecosystem.organisms.Animal;

public class Mammal extends Animal {

    public Mammal(String name, String habitat) {
        super(name, habitat);
    }

    // Publicly overriding all inherited organism behaviors
    @Override
    public void move() {
        System.out.println(name + " moves using limbs appropriate for its environment.");
    }

    @Override
    public void grow() {
        System.out.println(name + " grows steadily from birth to adulthood.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " gives birth to live young and cares for them.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " consumes a variety of foods based on species.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " responds quickly to its environment using advanced senses.");
    }

    @Override
    public void respire() {
        System.out.println(name + " breathes air through lungs.");
    }

    @Override
    public void communicate() {
        System.out.println(name + " communicates using sounds, gestures, or signals.");
    }

    @Override
    public void huntOrGraze() {
        System.out.println(name + " hunts prey or grazes depending on dietary needs.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps to rest and restore energy.");
    }

    @Override
    public void defend() {
        System.out.println(name + " defends itself or its young using strength or strategy.");
    }

    // Mammal-specific behaviors (can remain protected or changed to public if needed)
    protected void giveBirth() {
        System.out.println(name + " gives birth to live young.");
    }

    protected void produceMilk() {
        System.out.println(name + " produces milk to feed its young.");
    }

    protected void regulateBodyTemperature() {
        System.out.println(name + " maintains a constant body temperature.");
    }

    protected void haveHairOrFur() {
        System.out.println(name + " has hair or fur covering its body.");
    }

    protected void breatheAir() {
        System.out.println(name + " breathes air through lungs.");
    }
}
