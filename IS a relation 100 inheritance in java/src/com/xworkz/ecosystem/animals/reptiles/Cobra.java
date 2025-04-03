package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class Cobra extends Reptile {
    public Cobra() {
        super("Cobra", "Forests and grasslands");
    }

    public void hoodDisplay() {
        System.out.println(name + " expands its hood to appear larger and more intimidating.");
    }

    public void venomousBite() {
        System.out.println(name + " injects venom into its prey using sharp fangs.");
    }
}
