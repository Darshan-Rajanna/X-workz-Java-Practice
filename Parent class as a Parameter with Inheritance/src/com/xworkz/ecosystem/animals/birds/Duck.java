package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Duck extends Bird {

    public Duck() {
        super("Duck", "Wetlands, ponds, rivers, and lakes");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies short distances and migrates seasonally.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs in nests near water.");
    }

    @Override
    public void buildNest() {
        System.out.println(name + " builds simple nests using grasses and feathers.");
    }

    @Override
    public void sing() {
        System.out.println(name + " makes quacking sounds instead of singing.");
    }

    @Override
    public void migrate() {
        System.out.println(name + " migrates to warmer places during winter.");
    }
}
