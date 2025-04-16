package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Bird;

public class Sparrow implements Bird {
    public void fly() { System.out.println("Sparrow flies in quick bursts"); }
    public void layEggs() { System.out.println("Sparrow lays 4-5 eggs per clutch"); }
    public void buildNest() { System.out.println("Sparrow builds cup-shaped nests"); }
}
