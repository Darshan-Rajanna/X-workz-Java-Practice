package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class PuffballMushroom extends Fungi {
    public PuffballMushroom() {
        super("Puffball Mushroom", "Grasslands, decaying wood");
    }

    public void releaseSpores() {
        System.out.println(name + " releases spores in clouds when mature.");
    }
}
