package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class Turtle extends Reptile {
    public Turtle(String name, String habitat) {
        super(name, habitat);
    }

    public void retractIntoShell() {
        System.out.println(name + " retracts its head and limbs into its shell for protection.");
    }
}
