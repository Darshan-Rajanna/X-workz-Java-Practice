package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Fish;

public class Salmon implements Fish {
    public void swim() { System.out.println("Salmon swims upstream to spawn"); }
    public void breatheUnderwater() { System.out.println("Salmon extracts oxygen from water"); }
    public void layEggsInWater() { System.out.println("Salmon deposits eggs in gravel beds"); }
}
