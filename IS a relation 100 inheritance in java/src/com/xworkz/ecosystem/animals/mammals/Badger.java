package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Badger extends Mammal {
    public Badger() {
        super("Badger", "Grasslands and forests");
    }

    public void burrow() {
        System.out.println(name + " digs burrows for shelter and safety.");
    }

    public void nocturnalBehavior() {
        System.out.println(name + " is primarily active at night.");
    }
}
