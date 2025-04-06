package com.xworkz.ecosystem.animals.fish;

import com.xworkz.ecosystem.animals.Fish;

public class Pufferfish extends Fish {

    public Pufferfish() {
        super("Pufferfish", "Tropical and subtropical oceans");
    }

    @Override
    public void swim() {
        System.out.println(name + " swims slowly and awkwardly using its fins.");
    }

    @Override
    public void breatheThroughGills() {
        System.out.println(name + " uses its gills to extract oxygen from seawater.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs on sandy or rocky ocean beds.");
    }

    @Override
    public void liveInWater() {
        System.out.println(name + " lives entirely underwater, often hiding among rocks.");
    }

    @Override
    public void hasFins() {
        System.out.println(name + " uses small fins to hover or dart when threatened.");
    }
}
