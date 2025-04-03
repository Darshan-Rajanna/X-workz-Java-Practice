package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class OysterMushroom extends Fungi {
    public OysterMushroom() {
        super("Oyster Mushroom", "Decaying wood, forests");
    }

    public void popularForCooking() {
        System.out.println(name + " is popular for cooking due to its mild, delicate taste.");
    }
}
