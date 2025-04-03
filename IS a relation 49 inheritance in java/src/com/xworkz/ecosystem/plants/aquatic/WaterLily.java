package com.xworkz.ecosystem.plants.aquatic;

import com.xworkz.ecosystem.plants.AquaticPlant;

public class WaterLily extends AquaticPlant {
    public WaterLily() {
        super("Water Lily", "Freshwater ponds and lakes");
    }

    public void floatOnWater() {
        System.out.println(name + " has floating leaves that rest on the water surface.");
    }

    public void bloomBeautifulFlowers() {
        System.out.println(name + " produces beautiful, vibrant flowers.");
    }
}
