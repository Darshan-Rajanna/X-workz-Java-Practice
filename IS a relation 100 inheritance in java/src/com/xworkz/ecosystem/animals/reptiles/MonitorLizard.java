package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class MonitorLizard extends Reptile {
    public MonitorLizard() {
        super("Monitor Lizard", "Forests, savannas, and wetlands");
    }

    public void sharpClaws() {
        System.out.println(name + " has sharp claws for digging and climbing.");
    }

    public void activePredator() {
        System.out.println(name + " actively hunts insects, birds, and small mammals.");
    }
}
