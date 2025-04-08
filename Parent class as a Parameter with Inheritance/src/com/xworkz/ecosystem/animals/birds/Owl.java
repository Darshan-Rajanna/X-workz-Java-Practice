package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Owl extends Bird {

    public Owl() {
        super("Owl", "Forests, deserts, and urban areas");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies silently using serrated wings.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays white eggs in secluded places.");
    }

    @Override
    public void buildNest() {
        System.out.println(name + " often uses abandoned nests or cavities.");
    }

    @Override
    public void sing() {
        System.out.println(name + " hoots and screeches at night.");
    }

    @Override
    public void migrate() {
        System.out.println(name + " is mostly resident but some species migrate.");
    }
}
