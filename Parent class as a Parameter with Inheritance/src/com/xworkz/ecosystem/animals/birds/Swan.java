package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Swan extends Bird {

    public Swan() {
        super("Swan", "Lakes, rivers, and wetlands");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies gracefully in V-shaped formations.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs in large nests near water.");
    }

    @Override
    public void buildNest() {
        System.out.println(name + " builds nests using reeds and grasses.");
    }

    @Override
    public void sing() {
        System.out.println(name + " makes hissing or trumpeting calls.");
    }

    @Override
    public void migrate() {
        System.out.println(name + " migrates seasonally to avoid freezing lakes.");
    }
}
