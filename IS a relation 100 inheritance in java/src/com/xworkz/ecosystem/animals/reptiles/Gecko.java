package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class Gecko extends Reptile {
    public Gecko() {
        super("Gecko", "Tropical forests, deserts, and homes");
    }

    public void climbWalls() {
        System.out.println(name + " can climb walls and ceilings using adhesive toe pads.");
    }

    public void nightVision() {
        System.out.println(name + " has excellent night vision for hunting in the dark.");
    }
}
