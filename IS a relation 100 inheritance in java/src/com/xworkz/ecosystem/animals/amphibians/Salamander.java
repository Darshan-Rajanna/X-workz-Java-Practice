package com.xworkz.ecosystem.animals.amphibians;

import com.xworkz.ecosystem.animals.Amphibian;

public class Salamander extends Amphibian {
    public Salamander() {
        super("Salamander", "Wetlands, forests");
    }

    public void regenerateLimbs() {
        System.out.println(name + " can regenerate lost limbs.");
    }
}
