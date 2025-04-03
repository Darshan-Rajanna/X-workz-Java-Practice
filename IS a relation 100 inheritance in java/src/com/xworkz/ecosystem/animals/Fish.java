package com.xworkz.ecosystem.animals;

import com.xworkz.ecosystem.organisms.Animal;

public class Fish extends Animal {
    public Fish(String name, String habitat) {
        super(name, habitat);
    }

    public void swim() {
        System.out.println(name + " is swimming in the water.");
    }

    public void breatheThroughGills() {
        System.out.println(name + " breathes through gills.");
    }

    public void layEggs() {
        System.out.println(name + " lays eggs in water.");
    }

    public void liveInWater() {
        System.out.println(name + " is adapted to live in aquatic environments.");
    }

    public void hasFins() {
        System.out.println(name + " has fins to navigate through water.");
    }
}

