package com.xworkz.ecosystem.animals.amphibians;

import com.xworkz.ecosystem.animals.Amphibian;

public class Newt extends Amphibian {
    public Newt() {
        super("Newt", "Ponds, wetlands");
    }

    public void aquaticAndTerrestrial() {
        System.out.println(name + " has both aquatic and terrestrial phases in its life cycle.");
    }
}
