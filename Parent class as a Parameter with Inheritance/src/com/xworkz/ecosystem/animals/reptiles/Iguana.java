package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class Iguana extends Reptile {
    public Iguana() {
        super("Iguana", "Tropical rainforests and coastal regions");
    }

    @Override
    public void crawl() {
        System.out.println(name + " crawls with strong legs and a long tail.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs in burrows dug in soft soil.");
    }

    @Override
    public void coldBlooded() {
        System.out.println(name + " relies on sunlight to warm its body.");
    }

    @Override
    public void shedSkin() {
        System.out.println(name + " sheds its skin in large sections.");
    }

    @Override
    public void useCamouflage() {
        System.out.println(name + " uses green coloration to hide in foliage.");
    }
}
