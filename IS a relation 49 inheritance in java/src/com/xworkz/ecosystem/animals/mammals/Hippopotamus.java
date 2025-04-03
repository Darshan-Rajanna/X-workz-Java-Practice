package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Hippopotamus extends Mammal {
    public Hippopotamus() {
        super("Hippopotamus", "Rivers and lakes");
    }

    public void stayUnderwater() {
        System.out.println(name + " can stay submerged in water for extended periods.");
    }

    public void territorialBehavior() {
        System.out.println(name + " is highly territorial in water.");
    }
}
