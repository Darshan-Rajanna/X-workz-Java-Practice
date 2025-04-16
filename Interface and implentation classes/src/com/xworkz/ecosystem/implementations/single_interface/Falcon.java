package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Bird;

public class Falcon implements Bird {
    public void layEggs() { System.out.println("Falcon lays eggs in cliffs"); }
    public void fly() { System.out.println("Falcon flies at high speeds"); }
    public void sing() { System.out.println("Falcon does not sing, it screeches"); }
}
