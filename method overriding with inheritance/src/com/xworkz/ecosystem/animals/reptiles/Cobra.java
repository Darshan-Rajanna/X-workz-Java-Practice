package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class Cobra extends Reptile {
    public Cobra() {
        super("Cobra", "Forests, grasslands, and near human settlements");
    }

    @Override
    public void crawl() {
        System.out.println(name + " slithers silently across the ground.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs and sometimes guards them.");
    }

    @Override
    public void coldBlooded() {
        System.out.println(name + " is cold-blooded and regulates its body temperature externally.");
    }

    @Override
    public void shedSkin() {
        System.out.println(name + " sheds its skin regularly to grow.");
    }

    @Override
    public void useCamouflage() {
        System.out.println(name + " uses natural patterns for camouflage.");
    }
}
