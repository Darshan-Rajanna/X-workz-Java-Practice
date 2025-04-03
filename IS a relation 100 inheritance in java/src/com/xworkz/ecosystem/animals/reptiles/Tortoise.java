package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class Tortoise extends Reptile {
    public Tortoise() {
        super("Tortoise", "Land and semi-arid regions");
    }

    public void longLifespan() {
        System.out.println(name + " can live for over a hundred years.");
    }

    public void slowMovement() {
        System.out.println(name + " moves slowly but steadily.");
    }
}
