package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class KomodoDragon extends Reptile {
    public KomodoDragon(String name, String habitat) {
        super(name, habitat);
    }

    public void deadlyBite() {
        System.out.println(name + " has a deadly bite with toxic saliva.");
    }
}
