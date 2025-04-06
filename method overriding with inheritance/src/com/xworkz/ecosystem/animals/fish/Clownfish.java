package com.xworkz.ecosystem.animals.fish;

import com.xworkz.ecosystem.animals.Fish;

public class Clownfish extends Fish {
    public Clownfish() {
        super("Clownfish", "Coral reefs");
    }

    public void liveInSeaAnemones() {
        System.out.println(name + " lives symbiotically with sea anemones.");
    }
}
