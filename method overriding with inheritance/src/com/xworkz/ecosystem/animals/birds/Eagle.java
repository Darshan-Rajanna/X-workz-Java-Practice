package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Eagle extends Bird {

    public Eagle() {
        super("Eagle", "Mountains, forests, and open plains");
    }

    @Override
    public void fly() {
        System.out.println(name + " soars high using thermal currents.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs in large nests on cliffs or tall trees.");
    }

    @Override
    public void buildNest() {
        System.out.println(name + " builds massive nests called eyries.");
    }

    @Override
    public void sing() {
        System.out.println(name + " emits high-pitched screeches.");
    }

    @Override
    public void migrate() {
        System.out.println(name + " may migrate short distances for food.");
    }
}
