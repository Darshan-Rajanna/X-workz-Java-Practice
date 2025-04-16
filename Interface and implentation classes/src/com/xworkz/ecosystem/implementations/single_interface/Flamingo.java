package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Bird;

public class Flamingo implements Bird {
    public void fly() { System.out.println("Flamingo flies with long neck extended"); }
    public void layEggs() { System.out.println("Flamingo lays single chalky-white egg"); }
    public void buildNest() { System.out.println("Flamingo builds mud mound nests"); }
}
