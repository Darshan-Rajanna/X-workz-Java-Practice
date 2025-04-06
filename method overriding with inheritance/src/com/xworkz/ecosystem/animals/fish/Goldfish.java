package com.xworkz.ecosystem.animals.fish;

import com.xworkz.ecosystem.animals.Fish;

public class Goldfish extends Fish {
    public Goldfish() {
        super("Goldfish", "Freshwater ponds and aquariums");
    }

    public void domesticatedPet() {
        System.out.println(name + " is a popular domesticated pet.");
    }
}
