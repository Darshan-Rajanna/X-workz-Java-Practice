package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class Crocodile extends Reptile {
    public Crocodile(String name, String habitat) {
        super(name, habitat);
    }

    public void powerfulBite() {
        System.out.println(name + " has the strongest bite force of any animal.");
    }
}
