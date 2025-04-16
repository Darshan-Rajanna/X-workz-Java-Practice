package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Fish;

public class Trout implements Fish {
    public void swim() { System.out.println("Trout swims in cold freshwater"); }
    public void breatheUnderwater() { System.out.println("Trout uses gills to extract oxygen"); }
    public void layEggsInWater() { System.out.println("Trout spawns in gravel beds"); }
}
