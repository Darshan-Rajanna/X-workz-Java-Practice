package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Sparrow extends Bird {

    public Sparrow() {
        super("Sparrow", "Urban areas, gardens, and farmlands");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies quickly and flits between trees.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays small eggs in hidden nests.");
    }

    @Override
    public void buildNest() {
        System.out.println(name + " builds nests in crevices and rooftops.");
    }

    @Override
    public void sing() {
        System.out.println(name + " chirps and sings in short bursts.");
    }

    @Override
    public void migrate() {
        System.out.println(name + " is mostly non-migratory.");
    }
}
