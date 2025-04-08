package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class BarnOwl extends Bird {

    public BarnOwl() {
        super("Barn Owl", "Open countryside, farmlands, and woodlands");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies silently at night using specialized feathers.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays white eggs in barns and tree cavities.");
    }

    @Override
    public void buildNest() {
        System.out.println(name + " builds nests using feathers and soft materials in dark, safe places.");
    }

    @Override
    public void sing() {
        System.out.println(name + " does not sing but screeches to communicate.");
    }

    @Override
    public void migrate() {
        System.out.println(name + " may migrate short distances depending on food availability.");
    }
}
