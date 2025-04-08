package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class Alligator extends Reptile {

    public Alligator() {
        super("Alligator", "Swamps, rivers, and lakes");
    }

    @Override
    public void crawl() {
        System.out.println(name + " crawls stealthily near water bodies.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs in nests made of vegetation.");
    }

    @Override
    public void coldBlooded() {
        System.out.println(name + " is cold-blooded and basks in the sun to regulate temperature.");
    }

    @Override
    public void shedSkin() {
        System.out.println(name + " sheds its skin as it grows.");
    }

    @Override
    public void useCamouflage() {
        System.out.println(name + " uses its dark color to blend into murky waters.");
    }
}
