package com.xworkz.ecosystem.animals.fish;

import com.xworkz.ecosystem.animals.Fish;

public class Shark extends Fish {
    public Shark() {
        super("Shark", "Oceans");
    }

    public void apexPredator() {
        System.out.println(name + " is an apex predator with a keen sense of smell.");
    }
}
