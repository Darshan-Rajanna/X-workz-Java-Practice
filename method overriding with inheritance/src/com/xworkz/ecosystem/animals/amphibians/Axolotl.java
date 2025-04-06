package com.xworkz.ecosystem.animals.amphibians;

import com.xworkz.ecosystem.animals.Amphibian;

public class Axolotl extends Amphibian {
    public Axolotl() {
        super("Axolotl", "Lakes, freshwater");
    }

    public void regenerateBodyParts() {
        System.out.println(name + " is a neotenic salamander that can regenerate body parts.");
    }
}
