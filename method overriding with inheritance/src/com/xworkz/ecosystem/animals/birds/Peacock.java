package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Peacock extends Bird {

    public Peacock() {
        super("Peacock", "Forests and open farmland");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies short distances despite its large tail.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs in ground nests.");
    }

    @Override
    public void buildNest() {
        System.out.println(name + " builds shallow ground nests.");
    }

    @Override
    public void sing() {
        System.out.println(name + " makes loud, piercing calls.");
    }

    @Override
    public void migrate() {
        System.out.println(name + " is mostly non-migratory.");
    }
}
