package com.xworkz.ecosystem.animals;

import com.xworkz.ecosystem.organisms.Animal;

public class Amphibian extends Animal {

    public Amphibian(String name, String habitat) {
        super(name, habitat);
    }

    // Overriding inherited protected methods from Animal and making them public
    @Override
    public void move() {
        System.out.println(name + " swims in water and jumps or crawls on land.");
    }

    @Override
    public void communicate() {
        System.out.println(name + " communicates through croaking or body gestures.");
    }

    @Override
    public void huntOrGraze() {
        System.out.println(name + " hunts insects with its sticky tongue.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps in moist, hidden environments.");
    }

    @Override
    public void defend() {
        System.out.println(name + " defends using camouflage or toxic skin secretions.");
    }

    // Overriding Organism methods (these are public in Animal)
    @Override
    public void grow() {
        System.out.println(name + " grows from tadpole to adult through metamorphosis.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " lays eggs in water and reproduces sexually.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " feeds on insects and small invertebrates.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " responds to moisture, temperature, and predators.");
    }

    @Override
    public void respire() {
        System.out.println(name + " respires through skin, lungs, and gills (in larval stage).");
    }

    // 5 Amphibian-specific protected methods
    protected void liveInWaterAndLand() {
        System.out.println(name + " can live both in water and on land.");
    }

    protected void layEggsInWater() {
        System.out.println(name + " lays eggs in water.");
    }

    protected void undergoMetamorphosis() {
        System.out.println(name + " undergoes metamorphosis from larva to adult.");
    }

    protected void moistSkin() {
        System.out.println(name + " has moist skin that helps in respiration.");
    }

    protected void coldBlooded() {
        System.out.println(name + " is cold-blooded and relies on the environment for body heat.");
    }
}
