package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class Mold extends Fungi {
    public Mold(String name, String habitat) {
        super(name, habitat);
    }

    public void infectPlants() {
        System.out.println(name + " is infecting plants and causing Moulds.");
    }
}

