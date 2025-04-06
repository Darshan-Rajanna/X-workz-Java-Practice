package com.xworkz.ecosystem.animals;

import com.xworkz.ecosystem.organisms.Animal;

public class Amphibian extends Animal {
    public Amphibian(String name, String habitat) {
        super(name, habitat);
    }

    public void liveInWaterAndLand() {
        System.out.println(name + " can live both in water and on land.");
    }

    public void layEggsInWater() {
        System.out.println(name + " lays eggs in water.");
    }

    public void undergoMetamorphosis() {
        System.out.println(name + " undergoes metamorphosis from larva to adult.");
    }

    public void moistSkin() {
        System.out.println(name + " has moist skin that helps in respiration.");
    }

    public void coldBlooded() {
        System.out.println(name + " is cold-blooded and relies on the environment for body heat.");
    }
}

