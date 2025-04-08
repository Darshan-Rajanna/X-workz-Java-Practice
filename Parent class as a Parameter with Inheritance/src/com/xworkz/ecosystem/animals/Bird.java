package com.xworkz.ecosystem.animals;

import com.xworkz.ecosystem.organisms.Animal;

public class Bird extends Animal {

    public Bird(String name, String habitat) {
        super(name, habitat);
    }

    // Overriding and making Animal's protected methods public
    @Override
    public void move() {
        System.out.println(name + " flies through the sky.");
    }

    @Override
    public void communicate() {
        System.out.println(name + " communicates using chirps and songs.");
    }

    @Override
    public void huntOrGraze() {
        System.out.println(name + " searches for seeds, insects, or small creatures to eat.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps perched on branches, often with one eye open.");
    }

    @Override
    public void defend() {
        System.out.println(name + " defends itself by flying away or using its beak and claws.");
    }

    // Overriding Organism behaviors
    @Override
    public void grow() {
        System.out.println(name + " grows from chick to adult bird.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " reproduces by laying eggs.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " pecks at food like seeds, worms, or fruits.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " responds to sound, light, and predators.");
    }

    @Override
    public void respire() {
        System.out.println(name + " breathes using lungs and air sacs.");
    }

    // 5 Bird-specific protected methods
    protected void fly() {
        System.out.println(name + " is flying in the sky.");
    }

    protected void layEggs() {
        System.out.println(name + " lays eggs for reproduction.");
    }

    protected void buildNest() {
        System.out.println(name + " builds a nest for shelter.");
    }

    protected void sing() {
        System.out.println(name + " is singing melodious sounds.");
    }

    protected void migrate() {
        System.out.println(name + " migrates seasonally for better living conditions.");
    }
}
