package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class OakTree extends Tree {
    public OakTree() {
        super("Oak Tree", "Forests and woodlands");
    }

    @Override
    public void growTall() {
        System.out.println(name + " grows strong and tall with a broad canopy.");
    }

    @Override
    public void shedLeaves() {
        System.out.println(name + " sheds leaves in fall, enriching the soil.");
    }

    @Override
    public void provideOxygen() {
        System.out.println(name + " plays a vital role in oxygen generation.");
    }

    @Override
    public void produceFruitsOrSeeds() {
        System.out.println(name + " produces acorns, which serve as food for wildlife.");
    }

    @Override
    public void supportEcosystem() {
        System.out.println(name + " provides shelter and sustenance for forest creatures.");
    }
}
