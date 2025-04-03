package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Macaw extends Bird {
    public Macaw() {
        super("Macaw", "Tropical rainforests");
    }

    public void mimicSounds() {
        System.out.println(name + " can mimic human speech and various sounds.");
    }

    public void displayBrightColors() {
        System.out.println(name + " has bright, colorful feathers.");
    }
}
