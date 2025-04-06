package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Penguin extends Bird {

    public Penguin() {
        super("Penguin", "Antarctic and sub-Antarctic regions");
    }

    @Override
    public void fly() {
        System.out.println(name + " cannot fly but swims expertly.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs on icy or rocky surfaces.");
    }

    @Override
    public void buildNest() {
        System.out.println(name + " builds nests using stones and pebbles.");
    }

    @Override
    public void sing() {
        System.out.println(name + " uses braying or honking sounds to communicate.");
    }

    @Override
    public void migrate() {
        System.out.println(name + " migrates between breeding and feeding grounds.");
    }
}
