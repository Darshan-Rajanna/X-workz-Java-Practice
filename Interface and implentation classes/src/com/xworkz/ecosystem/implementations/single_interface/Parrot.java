package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Bird;

public class Parrot implements Bird {
    public void fly() { System.out.println("Parrot flies between trees"); }
    public void layEggs() { System.out.println("Parrot lays 2-8 white eggs"); }
    public void buildNest() { System.out.println("Parrot nests in tree cavities"); }
}
