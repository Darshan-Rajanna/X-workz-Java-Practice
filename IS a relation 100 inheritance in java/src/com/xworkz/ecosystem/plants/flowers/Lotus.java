package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Lotus extends FloweringPlant {
    public Lotus() {
        super("Lotus", "Ponds, lakes, wetlands");
    }

    public void floatOnWater() {
        System.out.println(name + " floats on water with its broad leaves.");
    }

    public void symbolicSignificance() {
        System.out.println(name + " is a symbol of purity and enlightenment in many cultures.");
    }
}
