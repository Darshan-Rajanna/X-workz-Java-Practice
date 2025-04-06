package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Eagle extends Bird {
    public Eagle(String name, String habitat) {
        super(name, habitat);
    }

    public void huntPrey() {
        System.out.println(name  + " hunts using sharp talons and keen eyesight.");
    }
}