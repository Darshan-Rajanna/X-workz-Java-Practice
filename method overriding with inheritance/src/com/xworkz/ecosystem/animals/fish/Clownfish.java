package com.xworkz.ecosystem.animals.fish;

import com.xworkz.ecosystem.animals.Fish;

public class Clownfish extends Fish {

    public Clownfish() {
        super("Clownfish", "Warm shallow seas, coral reefs");
    }

    @Override
    public void swim() {
        System.out.println(name + " swims with short bursts of movement among sea anemones.");
    }

    @Override
    public void breatheThroughGills() {
        System.out.println(name + " breathes through gills, extracting oxygen from water.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs on flat surfaces close to sea anemones.");
    }

    @Override
    public void liveInWater() {
        System.out.println(name + " lives entirely in saltwater habitats.");
    }

    @Override
    public void hasFins() {
        System.out.println(name + " uses its fins to maneuver through coral reefs.");
    }
}
