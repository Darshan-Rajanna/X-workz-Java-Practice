package com.xworkz.ecosystem.animals.fish;

import com.xworkz.ecosystem.animals.Fish;

public class Pufferfish extends Fish {
    public Pufferfish() {
        super("Pufferfish", "Coastal waters");
    }

    public void inflateAsDefense() {
        System.out.println(name + " inflates its body to scare predators.");
    }
}
