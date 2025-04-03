package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Sparrow extends Bird {
    public Sparrow(String name, String habitat) {
        super(name, habitat);
    }

    public void chirp() {
        System.out.println(name + " chirps joyfully throughout the day.");
    }
}
