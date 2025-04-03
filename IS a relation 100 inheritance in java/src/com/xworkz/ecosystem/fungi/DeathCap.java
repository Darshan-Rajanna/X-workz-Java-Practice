package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class DeathCap extends Fungi {
    public DeathCap() {
        super("Death Cap", "Forests, near oak and pine trees");
    }

    public void highlyPoisonous() {
        System.out.println(name + " is one of the most poisonous mushrooms in the world.");
    }
}
