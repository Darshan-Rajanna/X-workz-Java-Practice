package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Bird;

public class Crow implements Bird {
    public void layEggs() { System.out.println("Crow lays eggs in nests"); }
    public void fly() { System.out.println("Crow flies skillfully, known for intelligence"); }
    public void sing() { System.out.println("Crow caws loudly"); }
}
