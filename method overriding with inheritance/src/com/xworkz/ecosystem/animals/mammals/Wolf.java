package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Wolf extends Mammal {
    public Wolf() {
        super("Wolf", "Forests and grasslands");
    }

    public void howl() {
        System.out.println(name + " howls to communicate with its pack.");
    }

    public void liveInPack() {
        System.out.println(name + " exhibits strong pack behavior and social hierarchy.");
    }
}
