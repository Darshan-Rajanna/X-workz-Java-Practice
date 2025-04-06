package com.xworkz.ecosystem.animals.amphibians;

import com.xworkz.ecosystem.animals.Amphibian;

public class Salamander extends Amphibian {

    public Salamander() {
        super("Salamander", "Woodlands and streams");
    }

    @Override
    public void liveInWaterAndLand() {
        System.out.println(name + " spends part of its life in water and part on moist land.");
    }

    @Override
    public void layEggsInWater() {
        System.out.println(name + " lays eggs in slow-moving water or damp soil.");
    }

    @Override
    public void undergoMetamorphosis() {
        System.out.println(name + " transforms from aquatic larva with gills to adult with lungs.");
    }

    @Override
    public void moistSkin() {
        System.out.println(name + " has moist, soft skin that absorbs oxygen and water.");
    }

    @Override
    public void coldBlooded() {
        System.out.println(name + " is cold-blooded and prefers cool, damp environments.");
    }
}
