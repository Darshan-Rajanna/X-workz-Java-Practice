package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class Chameleon extends Reptile {
    public Chameleon(String name, String habitat) {
        super(name, habitat);
    }

    public void changeColor() {
        System.out.println(name + " changes its color based on mood and surroundings.");
    }
}
