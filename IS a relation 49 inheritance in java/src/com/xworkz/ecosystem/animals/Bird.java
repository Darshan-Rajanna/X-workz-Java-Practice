package com.xworkz.ecosystem.animals;
import com.xworkz.ecosystem.organisms.Animal;

public class Bird extends Animal {
    public Bird(String name, String habitat) {
        super(name, habitat);
    }

    public void fly() {
        System.out.println(name + " is flying in the sky.");
    }

    public void layEggs() {
        System.out.println(name + " lays eggs for reproduction.");
    }

    public void buildNest() {
        System.out.println(name + " builds a nest for shelter.");
    }

    public void sing() {
        System.out.println(name + " is singing melodious sounds.");
    }

    public void migrate() {
        System.out.println(name + " migrates seasonally for better living conditions.");
    }
}
