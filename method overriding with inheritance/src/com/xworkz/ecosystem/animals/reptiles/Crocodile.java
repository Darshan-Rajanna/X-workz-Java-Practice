package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class Crocodile extends Reptile {
    public Crocodile() {
        super("Crocodile", "Freshwater rivers, lakes, and wetlands");
    }

    @Override
    public void crawl() {
        System.out.println(name + " crawls powerfully on land using short legs.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs in muddy nests and guards them.");
    }

    @Override
    public void coldBlooded() {
        System.out.println(name + " basks in the sun to maintain body heat.");
    }

    @Override
    public void shedSkin() {
        System.out.println(name + " sheds its skin as part of growth.");
    }

    @Override
    public void useCamouflage() {
        System.out.println(name + " blends into the water with just eyes above the surface.");
    }
}
