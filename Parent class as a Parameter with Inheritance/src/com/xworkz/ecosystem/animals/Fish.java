package com.xworkz.ecosystem.animals;

import com.xworkz.ecosystem.organisms.Animal;

public class Fish extends Animal {

    public Fish(String name, String habitat) {
        super(name, habitat);
    }

    // Overriding and making Animal's protected methods public
    @Override
    public void move() {
        System.out.println(name + " swims gracefully in the water.");
    }

    @Override
    public void communicate() {
        System.out.println(name + " uses movements and vibrations to communicate.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps with its eyes open, usually at the bottom of the water body.");
    }

    @Override
    public void defend() {
        System.out.println(name + " uses camouflage or swims in schools to avoid predators.");
    }

    @Override
    public void huntOrGraze() {
        System.out.println(name + " feeds on smaller organisms or plants in water.");
    }

    // Overriding Organism behaviors
    @Override
    public void grow() {
        System.out.println(name + " grows from a hatchling to a mature fish.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " reproduces externally by laying eggs.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " feeds on smaller organisms or plants in water.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " responds to water currents, predators, and temperature.");
    }

    @Override
    public void respire() {
        System.out.println(name + " respires through gills.");
    }

    // 5 Fish-specific protected methods
    protected void swim() {
        System.out.println(name + " is swimming in the water.");
    }

    protected void breatheThroughGills() {
        System.out.println(name + " breathes through gills.");
    }

    protected void layEggs() {
        System.out.println(name + " lays eggs in water.");
    }

    protected void liveInWater() {
        System.out.println(name + " is adapted to live in aquatic environments.");
    }

    protected void hasFins() {
        System.out.println(name + " has fins to navigate through water.");
    }
}
