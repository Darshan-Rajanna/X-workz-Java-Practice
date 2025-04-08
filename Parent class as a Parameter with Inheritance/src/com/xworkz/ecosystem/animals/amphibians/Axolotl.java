package com.xworkz.ecosystem.animals.amphibians;

import com.xworkz.ecosystem.animals.Amphibian;

public class Axolotl extends Amphibian {

    public Axolotl() {
        super("Axolotl", "Lakes, freshwater");
    }

    @Override
    public void liveInWaterAndLand() {
        System.out.println(name + " can live in water but rarely ventures onto land.");
    }

    @Override
    public void layEggsInWater() {
        System.out.println(name + " lays hundreds of eggs in aquatic vegetation.");
    }

    @Override
    public void undergoMetamorphosis() {
        System.out.println(name + " typically does not metamorphose, remaining in its larval form.");
    }

    @Override
    public void moistSkin() {
        System.out.println(name + " has smooth, moist skin used for breathing and osmosis.");
    }

    @Override
    public void coldBlooded() {
        System.out.println(name + " is cold-blooded and its activity depends on surrounding water temperature.");
    }
}
