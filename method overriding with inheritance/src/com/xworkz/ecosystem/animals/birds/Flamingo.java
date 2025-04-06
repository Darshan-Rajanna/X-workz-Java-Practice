package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Flamingo extends Bird {

    public Flamingo() {
        super("Flamingo", "Lakes, lagoons, and wetlands");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies with neck outstretched and legs trailing.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays a single egg on a mud mound.");
    }

    @Override
    public void buildNest() {
        System.out.println(name + " builds conical mud nests in shallow water.");
    }

    @Override
    public void sing() {
        System.out.println(name + " produces honking or murmuring sounds.");
    }

    @Override
    public void migrate() {
        System.out.println(name + " migrates in flocks depending on climate.");
    }
}
