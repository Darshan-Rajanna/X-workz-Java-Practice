package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Hawk extends Bird {

    public Hawk() {
        super("Hawk", "Forests, mountains, and open fields");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies swiftly while scanning for prey.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs in high tree nests.");
    }

    @Override
    public void buildNest() {
        System.out.println(name + " builds stick nests in trees or cliffs.");
    }

    @Override
    public void sing() {
        System.out.println(name + " gives a sharp screech as a call.");
    }

    @Override
    public void migrate() {
        System.out.println(name + " migrates to warmer regions in winter.");
    }
}
