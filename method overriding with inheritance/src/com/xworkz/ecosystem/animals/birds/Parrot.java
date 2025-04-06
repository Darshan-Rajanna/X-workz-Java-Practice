package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Parrot extends Bird {

    public Parrot() {
        super("Parrot", "Tropical and subtropical forests");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies swiftly and often in flocks.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays white eggs in tree cavities.");
    }

    @Override
    public void buildNest() {
        System.out.println(name + " nests in holes or crevices.");
    }

    @Override
    public void sing() {
        System.out.println(name + " mimics human speech and whistles.");
    }

    @Override
    public void migrate() {
        System.out.println(name + " usually does not migrate.");
    }
}
