package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class Lichen extends Fungi {
    public Lichen(String name, String habitat) {
        super(name, habitat);
    }

    public void liveMutualistically() {
        System.out.println(name + " is living in a mutualistic relationship with algae.");
    }
}

