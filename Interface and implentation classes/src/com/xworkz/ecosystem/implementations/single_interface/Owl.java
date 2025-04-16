package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Bird;

public class Owl implements Bird {
    public void layEggs() { System.out.println("Owl lays eggs in hollow trees"); }

    public void buildNest() {
        System.out.println("Owl builds nests at night");
    }

    public void fly() { System.out.println("Owl flies silently at night"); }

}
