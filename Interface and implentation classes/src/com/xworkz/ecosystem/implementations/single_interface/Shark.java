package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Fish;

public class Shark implements Fish {
    public void swim() { System.out.println("Shark swims constantly to breathe"); }
    public void breatheUnderwater() { System.out.println("Shark uses gill slits"); }
    public void layEggsInWater() { System.out.println("Some sharks lay eggs (mermaid's purses)"); }
}
