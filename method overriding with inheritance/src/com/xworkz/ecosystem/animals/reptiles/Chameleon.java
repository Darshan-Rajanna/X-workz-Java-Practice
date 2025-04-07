package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class Chameleon extends Reptile {
    public Chameleon() {
        super("Chameleon", "Forests and jungles");
    }

    @Override
    public void crawl() {
        System.out.println(name + " crawls slowly on tree branches.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs in shallow holes in the ground.");
    }

    @Override
    public void coldBlooded() {
        System.out.println(name + " is cold-blooded and adapts to environmental temperature.");
    }

    @Override
    public void shedSkin() {
        System.out.println(name + " sheds its skin in small patches.");
    }

    @Override
    public void useCamouflage() {
        System.out.println(name + " changes color to camouflage and communicate.");
    }
}
