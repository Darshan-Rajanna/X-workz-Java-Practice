package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Bird;

public class Eagle implements Bird {
    public void fly() { System.out.println("Eagle soars at high altitudes"); }
    public void layEggs() { System.out.println("Eagle lays 1-3 eggs in nest"); }
    public void buildNest() { System.out.println("Eagle builds large stick nests"); }
}
