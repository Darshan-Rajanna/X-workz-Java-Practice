package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Hawk extends Bird {
    public Hawk() {
        super("Hawk", "Forests, mountains, and open fields");
    }

    public void sharpEyesight() {
        System.out.println(name + " has sharp eyesight for spotting prey from a distance.");
    }

    public void huntingBehavior() {
        System.out.println(name + " hunts small animals with speed and precision.");
    }
}
