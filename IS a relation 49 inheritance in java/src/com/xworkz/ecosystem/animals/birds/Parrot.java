package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Parrot extends Bird {
    public Parrot(String name, String habitat) {
        super(name, habitat);
    }

    public void mimicSounds() {
        System.out.println(name + " can mimic human speech and other sounds.");
    }
}
